//Selection Sorting
//Valid For only element is >0
package sorting;


import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp=0;
        int minIndex=0;
        System.out.println("Enter "+n+" array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Before Swapping");
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        //Selection Sort
        //n-1 bcz reduce the iteration size
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[minIndex]>arr[j])
                    minIndex=j;
            }
            temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
            for(int num:arr)
            {
                System.out.print(num+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("After Swapping");
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }
}
