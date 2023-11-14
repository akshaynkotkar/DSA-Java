//Find the element present in the array and return its indexes using array list.
package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class AlllIndexesArraylist {
    static ArrayList<Integer>allIndices(int arr[],int n,int target,int idx)
    {
        if(idx>=n)
        {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans=new ArrayList<>();
        if(arr[idx]==target)
        {
            ans.add(idx);
        }
        ArrayList<Integer> smallAns=allIndices(arr,n,target,idx+1);
        ans.addAll(smallAns);
        return  ans;
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
        ArrayList<Integer>ans=allIndices(arr,n,target,0);
        System.out.println("Element present at the indexes:");
        for(Integer i:ans)
        {
            System.out.println(i);
        }
    }
}
