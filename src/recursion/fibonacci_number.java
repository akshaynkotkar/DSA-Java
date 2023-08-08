//Program:To find nth fibonacci number
package recursion;

import java.util.Scanner;

public class fibonacci_number {
    int fib(int n)
    {
if(n==0 ||n==1)
{
    return n;
}
return fib(n-1)+fib(n-2);
/*
Or
 int prev=fib(n-1);
 int PrevPrev=fib(n-2);
 int ans=prev+PrevPrev;
 return ans;
 */
    }
    public static void main(String[] args) {
        fibonacci_number f=new fibonacci_number();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println(+n+" th fibonacci number is:" +f.fib(n));

        /*
        Loop is used when condition is to calculate fibonacci number from 0 to n
        for(int i=0;i<=n;i++)
        {
        System.out.print("  "+f.fib(i));
        }
         */
    }
}
