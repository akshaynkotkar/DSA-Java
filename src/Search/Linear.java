/*
Find the index of a element in a given array
 */
package Search;

import java.util.Scanner;

public class Linear {
    int linearSearch(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Linear lin=new Linear();
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
        int linear= lin.linearSearch(arr,key);
        if(linear==-1)
        {
            System.out.println("Key not Found");
        }
        else {
            System.out.println("Key found at index:"+linear);
        }
    }
}
/*
Time Complexity:  O(n)
Enter the array length:
5
Enter 5 elements in the array
2
4
6
8
10
Enter a key value to search in the array
10
Key found at index:4

 */
