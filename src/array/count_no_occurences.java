//Program :Count Number of occurrences of particular element
package array;

import java.util.Scanner;

public class count_no_occurences {
    static int countOccurrences(int arr[],int x)
    {
        int count=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==x)
            {
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter "+size +" Elements:");
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element which you want to search no of occurrences:");
        int a=sc.nextInt();
        System.out.println("The number of occurrences of "+a +" is :"+countOccurrences(arr,a));
    }
}


