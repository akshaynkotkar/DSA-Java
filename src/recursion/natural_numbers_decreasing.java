package recursion;

import java.util.Scanner;

public class natural_numbers_decreasing {
    void printDecreasing(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        natural_numbers_decreasing d=new natural_numbers_decreasing();
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Decreasing natural numbers from "+n +" to 1:");
        d.printDecreasing(n);
    }
}
