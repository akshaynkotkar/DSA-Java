package SPOS;

import java.util.Scanner;

public class page_replacement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch1;

        do{
            System.out.println("1.FIFO\n2.LRU\n");
            System.out.println("Enter your choice:");
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    int i, j, n;
                    int ref_str[]=new int[50];
                    int frame[]=new int[10];
                    int no, k, avail, fcount = 0;

                    System.out.println("Enter the number of pages:");
                    n=sc.nextInt();

                    System.out.println("Enter reference String of "+n+" pages:");
                    for(i=1;i<=n;i++)
                    {
                        ref_str[i]= sc.nextInt();

                    }
                    System.out.println("\nEnter the number of Frames:");
                    no= sc.nextInt();;
                    for (i = 0; i < no; i++)
                        frame[i] = -1;
                    j = 0;

                    for (i = 1; i <= n; i++)
                    {
                        System.out.print(ref_str[i]+"\t\t");
                        avail = 0;

                        for (k = 0; k < no; k++)
                        {
                            if (frame[k] == ref_str[i])
                            {
                                avail = 1;

                                for (k = 0; k < no; k++)
                                    System.out.print(frame[k]+"\t\t");
                                System.out.print("H");
                            }
                        }

                        if (avail == 0)
                        {
                            frame[j] = ref_str[i];
                            j = (j + 1) % no;
                            fcount++;

                            for (k = 0; k < no; k++)
                                System.out.print(frame[k]+"\t\t");
                            System.out.print("F");
                        }
                        System.out.println();
                    }
                    System.out.println("Page Fault Is "+ fcount);
                    break;
                case  2:
                    int min,f,pf=0,next=0;
                    int rs[]=new int[25];
                    int m[]=new int[10];

                    int count[]=new int[10];
                    int flag[]=new int[25];
                    System.out.println("Enter the number of pages:");
                    n=sc.nextInt();

                    System.out.println("Enter reference String of "+n+" pages:");
                    for(i=0;i<n;i++)
                    {
                        rs[i]= sc.nextInt();
                        flag[i]=0;
                    }
                    System.out.println("Enter the number of frames:");
                    f= sc.nextInt();
                    for(i=0;i<f;i++)
                    {
                        count[i]=0;
                        m[i]=-1;
                    }
                    System.out.println("\nThe Page Replacement process is --" );
                    for(i=0;i<n;i++)
                    {
                        for(j=0;j<f;j++)
                        {
                            if(m[j]==rs[i])
                            {
                                flag[i]=1;
                                count[j]=next;
                                next++;
                            }
                        }
                        if(flag[i]==0)
                        {
                            if(i<f)
                            {
                                m[i]=rs[i];
                                count[i]=next;
                                next++;
                            }
                            else
                            {
                                min=0;
                                for(j=0;j<f;j++)
                                    if(count[min] > count[j])
                                        min=j;
                                m[min]=rs[i];
                                count[min]=next;
                                next++;
                            }
                            pf++;
                        }
                        for(j=0;j<f;j++)
                            System.out.print(m[j]+"\t\t");
                        if(flag[i]==0)

                            System.out.print("PF No. --"+pf);
                        System.out.println();
                    }
                    System.out.println("\nThe number of page faults using LRU are:"+pf);
                    break;
                case 3:
                default:
                    System.out.println("Enter valid choice:");
                    break;
            }
            System.out.println("Do you want to continue if yes then press 1:");
           ch1=sc.nextInt();
        }while(ch1==1);
    }
}
