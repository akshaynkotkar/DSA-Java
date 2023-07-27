//Program:Count The number of triplets whose sum is equal to the given value x i.e target
package array;

import java.util.Scanner;

public class tripletSumArray {
    static int tripleteSum(int arr[],int target)
    {
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+2;j<n;j++)
            {
                for (int k=i+2;k<n;k++)
                {
                    if((arr[i]+arr[j]+arr[k])==target)
                    {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter " +size +" Elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target ");
        int target=sc.nextInt();
        System.out.println("The Triplet pairs:"+tripleteSum(arr,target));
    }
}
