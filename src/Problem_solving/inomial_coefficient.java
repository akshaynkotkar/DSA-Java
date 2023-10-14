/*
Given with formula
nCr=n!/r!(n-r)!
n=5 r=2
 */
package Problem_solving;

import java.util.Scanner;

public class inomial_coefficient {
     static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f*=i;
        }
        return f;
    }
    static int binomial_coefficient(int n,int r)
    {
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int n_and_r_fact=factorial(n-r);
        return n_fact/(r_fact*n_and_r_fact);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n=sc.nextInt();
        System.out.println("Enter value of r:" );
        int r=sc.nextInt();
        System.out.println("The binomial coefficient of n and r is:"+binomial_coefficient(n,r));
    }
}
