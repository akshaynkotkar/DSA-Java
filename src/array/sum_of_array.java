package array;

import java.util.Scanner;

class sum
{
    Scanner sc=new Scanner(System.in);
    void sum()
    {
        int size;
        int total=0;
        System.out.println("How many elements you want to insert:");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Taking input from user.........");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<size;j++)
        {

            total +=arr[j];
        }
        System.out.println("The sum of array elements is:" +total);
    }

}
public class sum_of_array {
    public static void main(String[] args) {
        sum s=new sum();
        s.sum();
    }
}
