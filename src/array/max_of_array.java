//Program:To print maximum number in the array
package array;

import java.util.Scanner;

class max{
    Scanner sc=new Scanner(System.in);

    void max_number(){
        int size;
        System.out.println("Enter the size of array:");
        size=sc.nextInt();
        int arr[]=new int[size];
        int ans=0;
        System.out.println("Insert element in array.....");
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int j=0;j<size;j++)
        {
            if(arr[j]>ans)
            {
                ans=arr[j];
            }
        }

        System.out.println("Maximum Number in the array is:"+ans);
    }
}
public class max_of_array {
    public static void main(String[] args) {
        max m=new max();
        m.max_number();

    }
}
