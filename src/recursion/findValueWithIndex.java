package recursion;

import java.util.Scanner;

public class findValueWithIndex {
    static int  findIndex(int arr[],int n,int target,int idx)
    {
        if(idx>=n) return -1;

        if(arr[idx]==target) return idx;


        return findIndex(arr,n,target,idx+1);
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

        System.out.println("Element Found at index :"+findIndex(arr,n,target,0));
    }
}
