package SPOS;
import java.math.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class disk_scheduling {
    public static void FCFS(int arr[], int size, int head)
    {
        int seek_count = 0;
        int cur_track, distance;

        for (int i = 0; i < size; i++) {
            cur_track = arr[i];

            distance = Math.abs(head - cur_track);

            seek_count += distance;

            head = cur_track;
        }

        System.out.println("Total number of seek operations:"+seek_count);
        System.out.println("Seek Sequence is:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void SCAN(int arr[], int size, int head, String direction) {
        int seek_count = 0;
        int cur_track;
        int index = 0;
        int distance;
        int left = 0, right = 0;

        // Separate the tracks into two halves: left and right of the initial head position
        for (int i = 0; i < size; i++) {
            if (arr[i] < head) {
                left++;
            } else if (arr[i] > head) {
                right++;
            }
        }

        // Sort the tracks in the left and right halves
        int leftArr[] = new int[left];
        int rightArr[] = new int[right];
        left = 0;
        right = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] < head) {
                leftArr[left++] = arr[i];
            } else if (arr[i] > head) {
                rightArr[right++] = arr[i];
            }
        }

        // Sort both halves in ascending order
        Arrays.sort(leftArr);
        Arrays.sort(rightArr);

        // Decide the direction based on user input
        if (direction.equalsIgnoreCase("left")) {
            for (int i = left - 1; i >= 0; i--) {
                cur_track = leftArr[i];

                distance = Math.abs(head - cur_track);

                seek_count += distance;

                head = cur_track;
            }

            // Move to the end of the disk
            seek_count += head;

            for (int i = 0; i < right; i++) {
                cur_track = rightArr[i];

                distance = Math.abs(head - cur_track);

                seek_count += distance;

                head = cur_track;
            }
        } else if (direction.equalsIgnoreCase("right")) {
            for (int i = 0; i < right; i++) {
                cur_track = rightArr[i];

                distance = Math.abs(head - cur_track);

                seek_count += distance;

                head = cur_track;
            }

            // Move to the end of the disk
            seek_count += (size - 1 - head);

            for (int i = left - 1; i >= 0; i--) {
                cur_track = leftArr[i];

                distance = Math.abs(head - cur_track);

                seek_count += distance;

                head = cur_track;
            }
        }

        System.out.println("Total number of seek operations: " + seek_count);
        System.out.println("Seek Sequence is:");

        // Print the seek sequence
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int ch,ch1,i,n = 0,TotalHeadMoment=0,initial = 0,count=0;;
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the number of disk requests:");
        size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the disk requests:");
        for (i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }

        int head;
        System.out.println("Enter the intial head position:");
        head=sc.nextInt();

    do {
        System.out.println("\n1.FCFS\n2.SSTF\n3.SCAN");
        System.out.println("Enter Your choice:");
        ch= sc.nextInt();
        switch (ch)
        {
            case 1:

                FCFS(arr, size, head);
                break;
            case 2:
                ArrayList<Integer> safeSequence = new ArrayList<>();
                while(count!=size)
                {
                    int min=1000,d,index = 0;
                    for(i=0;i<size;i++)
                    {
                        d=Math.abs(arr[i]-head);
                        if(min>d)
                        {
                            min=d;
                            index=i;
                        }

                    }
                    TotalHeadMoment=TotalHeadMoment+min;
                    head=arr[index];
                    // 1000 is for max
                    // you can use any number
                    arr[index]=1000;
                    count++;
                    safeSequence.add(head);
                }
                System.out.println("Total head movement is:"+TotalHeadMoment);
                System.out.println("Safe Sequence is:");
                for (int seq : safeSequence) {
                    System.out.print(seq + " ");
                }
                break;
            case 3:
                System.out.println("Enter the direction (left/right): ");
                String direction = sc.next();
                SCAN(arr, size, head, direction);
                break;
        }
        System.out.println("\nDo ou want to continue if yes then press 1:");
         ch1=sc.nextInt();
    }while(ch1==1);
    }
}
