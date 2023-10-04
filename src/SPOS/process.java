package SPOS;

import java.util.Scanner;

public class process {
    static void FCFS(int BT[],int n,String p[],int AT[])
    {
        int WT[]=new int[n];
        int TAT[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                WT[0]=0;
            }
            else {
                WT[i]=WT[i-1]+BT[i-1];
            }

        }
//        System.out.println("Printing The waiting time:");
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(WT[i]);
//            System.out.println();
//        }
        //System.out.println("Printing The waiting time:");
        for(int i=0;i<n;i++)
        {
            TAT[i]=WT[i]+BT[i];
        }
//        System.out.println("Printing The Total  time:");
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(TAT[i]);
//            System.out.println();
//        }
        System.out.println("Table for FCFS:");
        System.out.println("Process\tBurst Time\tArrival Time \tWaiting Time\tTurnaround Time");
        for (int i = 0; i < n; i++) {
            System.out.println(p[i] + "\t\t" + BT[i] + "\t\t" + AT[i] + "\t\t" +
                    WT[i] + "\t\t" + TAT[i]);
        }
    }
    //    static void SJF()
//    {
//
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Processes:");
        int n=sc.nextInt();
        String p[]=new String[n];
        int AT[]=new int[n];
        int BT[]=new int[n];
        int WT[]=new int[n];
        int TAT[]=new int[n];
        System.out.println("Enter the number of processes:");
        for(int i=0;i<n;i++)
        {
            p[i]= sc.next();
        }
        System.out.println("Enter the Arrival Time:");
        for(int i=0;i<n;i++)
        {
            AT[i]= sc.nextInt();
        }
        System.out.println("Enter the Bus Time:");
        for(int i=0;i<n;i++)
        {
            BT[i]= sc.nextInt();
        }

//        FCFS(BT,n);
        System.out.println("Enter your choice:");
        int ch=sc.nextInt();
        do{
            System.out.println("1.FCFS\n2.SJF\n3.RR\n4.Priority Scheduling");
            int ch1=sc.nextInt();

            switch(ch1)
            {
                case 1:
                    FCFS(BT,n,p,AT);
                    break;
                case 2:

                    int totalTime = 0;
                    double avgWaitingTime = 0;
                    double avgTurnaroundTime = 0;

                    int[] sortedIndexes = new int[n];
                    for (int i = 0; i < n; i++) {
                        sortedIndexes[i] = i;
                    }

                    // Sort processes by burst time (SJF)
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (BT[sortedIndexes[j]] > BT[sortedIndexes[j + 1]]) {
                                int temp = sortedIndexes[j];
                                sortedIndexes[j] = sortedIndexes[j + 1];
                                sortedIndexes[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("Process\tBurst Time\tWaiting Time\tTurnaround Time");

                    for (int i = 0; i < n; i++) {
                        int processIndex = sortedIndexes[i];
                        WT[processIndex] = totalTime;
                        TAT[processIndex] = WT[processIndex] + BT[processIndex];

                        System.out.println(p[processIndex] + "\t\t" + BT[processIndex] + "\t\t" +
                                WT[processIndex] + "\t\t" + TAT[processIndex]);

                        avgWaitingTime += WT[processIndex];
                        avgTurnaroundTime += TAT[processIndex];

                        totalTime += BT[processIndex];
                    }

                    avgWaitingTime /= n;
                    avgTurnaroundTime /= n;

                    System.out.println("\nAverage Waiting Time: " + avgWaitingTime);
                    System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
                    break;
                case 3:
                    int quantum = 2; // Time quantum

                    int[] RT = new int[n];  // Initialize remaining times to burst times
                    for (int i = 0; i < n; i++) {
                        RT[i] = BT[i];
                    }

                    int RtotalTime = 0;
                    boolean allCompleted = false;

                    while (!allCompleted) {
                        allCompleted = true;
                        for (int i = 0; i < n; i++) {
                            if (RT[i] > 0) {
                                allCompleted = false;
                                if (RT[i] > quantum) {
                                    RtotalTime += quantum;
                                    RT[i] -= quantum;
                                } else {
                                    RtotalTime += RT[i];
                                    WT[i] = RtotalTime - BT[i];
                                    RT[i] = 0;
                                }
                            }
                        }
                    }

                    for (int i = 0; i < n; i++) {
                        TAT[i] = BT[i] + WT[i];
                    }

                    double RavgWaitingTime = 0;
                    double RavgTurnaroundTime = 0;

                    System.out.println("Process\tBurst Time\tWaiting Time\tTurnaround Time");

                    for (int i = 0; i < n; i++) {
                        System.out.println(p[i] + "\t\t" + BT[i] + "\t\t" +
                                WT[i] + "\t\t" + TAT[i]);

                        RavgWaitingTime += WT[i];
                        RavgTurnaroundTime += TAT[i];
                    }

                    RavgWaitingTime /= n;
                    RavgTurnaroundTime /= n;

                    System.out.println("\nAverage Waiting Time: " + RavgWaitingTime);
                    System.out.println("Average Turnaround Time: " + RavgTurnaroundTime);
                    break;
                case 4:
                    int[] priorities = new int[n];
                    System.out.println("Enter the priorities:");
                    for(int i=0;i<n;i++)
                    {
                        priorities[i]=sc.nextInt();
                    }
                    boolean[] completed = new boolean[n];

                    int PtotalTime = 0;

                    while (true) {
                        int highestPriority = Integer.MAX_VALUE;
                        int highestPriorityIndex = -1;

                        for (int i = 0; i < n; i++) {
                            if (!completed[i] && priorities[i] < highestPriority) {
                                highestPriority = priorities[i];
                                highestPriorityIndex = i;
                            }
                        }

                        if (highestPriorityIndex == -1) {
                            // All processes have been completed
                            break;
                        }

                        int processIndex = highestPriorityIndex;
                        completed[processIndex] = true;

                        WT[processIndex] = PtotalTime;
                        TAT[processIndex] = WT[processIndex] + BT[processIndex];

                        PtotalTime += BT[processIndex];
                    }

                    double PavgWaitingTime = 0;
                    double PavgTurnaroundTime = 0;

                    System.out.println("Process\tBurst Time\tPriority\tWaiting Time\tTurnaround Time");

                    for (int i = 0; i < n; i++) {
                        System.out.println(p[i] + "\t\t" + BT[i] + "\t\t" + priorities[i] + "\t\t" +
                                WT[i] + "\t\t" + TAT[i]);

                        PavgWaitingTime += WT[i];
                        PavgTurnaroundTime += TAT[i];
                    }

                    PavgWaitingTime /= n;
                    PavgTurnaroundTime /= n;

                    System.out.println("\nAverage Waiting Time: " + PavgWaitingTime);
                    System.out.println("Average Turnaround Time: " + PavgTurnaroundTime);
                    break;
                default:
                    System.out.println("Enter a correct choice:");
                    break;

            }

        }while(ch==1);
    }

}
