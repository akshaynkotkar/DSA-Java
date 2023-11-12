package Problem_solving;

import java.util.Scanner;

public class any_base_to_decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n:");
        int n=sc.nextInt();
        System.out.println("Enter base of a number b:");
        int b=sc.nextInt();
        int d=getValueindecimal(n,b);
        System.out.println("Output in decimal:");
        System.out.println(d);
    }
    public static int getValueindecimal(int n,int b)
    {
        int rv=0;
        int p=1;
        while (n>0)
        {

           int dig= n  %  10;
           n=n/10;
           rv += dig * p;
           p=p*b;
        }
        return rv;
    }
}
/*
input as 1172 as base 8
and output as 634 as base 10

 */