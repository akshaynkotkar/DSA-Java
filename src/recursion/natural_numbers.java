//Write a program to print all natural numbers from 1 to n
package recursion;


import java.util.Scanner;

public class natural_numbers {
    void printIncreasing(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        natural_numbers p=new natural_numbers();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("First "+n+" natural numbers");
        p.printIncreasing(n);
    }
}
