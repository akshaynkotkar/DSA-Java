package recursion;

import java.util.Scanner;

public class sum_of_array {
    static int SumOfArray(int arr[],int index)
    {
        //base case
        if(index== arr.length)
        {
          return 0;
        }
        //small problem
        int smallAns=SumOfArray(arr,index+1);
        //Self Work and final ans
        return  smallAns+arr[index];
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
        System.out.println("Sum of array elements is: "+SumOfArray(arr,0));

    }
}
