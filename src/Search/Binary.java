/*
Binary Search:

Prerequisite ->Array should be sorted
Tc :O(log n)
 */


package Search;

import java.util.Scanner;

public class Binary {
    int binarySearch(int arr[],int key)
    {
       int start=0,end=arr.length-1;
       while(start<=end)
       {
           int mid=(start+end)/2;
           if(arr[mid]==key)
           {
               return mid;
           }
           if(arr[mid]<key)
           {
               start=mid+1;
           }
           else {
               end=mid-1;
           }
       }
       return -1;
    }
    public static void main(String[] args) {
        Binary bin=new Binary();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n=sc.nextInt();
        int arr []=new int[n];
        System.out.println("Enter "+n +" elements in the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a key value to search in the array");
        int key=sc.nextInt();
        int binary= bin.binarySearch(arr,key);
        if(binary==-1)
        {
            System.out.println("Key not Found");
        }
        else {
            System.out.println("Key found at index:"+binary);
        }
    }
}
