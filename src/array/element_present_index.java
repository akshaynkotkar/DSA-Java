//Program:To print element present or not in array also print the index of a element
package array;
import java.util.Scanner;

class element{
    Scanner sc=new Scanner(System.in);

    void present_or_not(){
        int size;
        System.out.println("Enter the size of array:");
        size=sc.nextInt();
        int arr[]=new int[size];
        int ans=-1;

        System.out.println("Insert element in array.....");
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter element which you want to search in array:");
        int sr= sc.nextInt();
        for(int j=0;j<size;j++)
        {
            if(arr[j]==sr)
            {
                ans=j;
            }
        }
        if(ans==-1)
        {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element present in the array "+sr +"at location:"+ans);
        }


    }
}


public class element_present_index {
    public static void main(String[] args) {
        element e=new element();
        e.present_or_not();
    }
}
