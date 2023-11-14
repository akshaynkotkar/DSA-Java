
//Given an array of size N and an integer X .The task is to find all the indices of the integer X in the array.
package recursion;

import java.util.Scanner;

public class findAllIndexes {
    static void  findAllIndices(int arr[],int n,int target,int idx)
    {
        if(idx>=n) return;

        if(arr[idx]==target)
        {
            System.out.println(idx);
        }
      findAllIndices(arr,n,target,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("Enter the target element:");
        int target=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" Array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Element present at the indexes:");
        findAllIndices(arr,n,target,0);
    }
}
