//Write a program to print a max value in the array using recursion

package recursion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class max_value_in_array {
    static int MaxInArray(int arr[],int index)
    {
        //base case
        if(index==arr.length-1)
        {
            return arr[index];
        }
        //small problem
        int smallAns=MaxInArray(arr,index+1);
        //Self Work and final ans
        return  Math.max(arr[index],smallAns);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the "+n+" array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum element int the given array is: "+MaxInArray(arr,0));

    }
}
