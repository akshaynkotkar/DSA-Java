//Question:Take an input test cases and take a nos and print the no is prime or not with considering
//time complexity of no of test cases...
package Problem_solving;
import java.util.Scanner;

public class prime_or_not {

/*

This Code is working properly but when test cases greater it takes more time to execute
and work the program for that we need to consider the time complexity and need to find best solution.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of test cases:");
        int t=sc.nextInt();
        for(int i=0;i<t;i++)//this loop taking 10^4 time
        {
            int n=sc.nextInt();
            int count=0;
            for(int div=1;div<=n;div++) //this taken 10^9 bcz i/p value n
            {
                if(n%div==0)
                {
                    count ++;
                }
            }
            if(count==2)
            {
                System.out.println("Prime");
            }
            else {
                System.out.println("Not Prime");
            }
        }

    }

    In Cpu We can perform 10^9 operations in a second but above gives 10^13
    */


    /*
    This code also may not sufficient for some test cases
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of test cases:");
        int t=sc.nextInt();
        for(int i=0;i<t;i++)//Here this loop takes 10^4
        {
            int n=sc.nextInt();
            int count=0;
            //But this loop takes 10^root n means less than previous one
            for(int div=2 ;div*div<=n;div++)//here div*div bcz of test case is less than or equal to root n.
            {
                if(n%div==0)
                {
                    count ++;
                }
            }
            if(count==0)
            {
                System.out.println("Prime");
            }
            else {
                System.out.println("Not Prime");
            }
        }

    }

     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of test cases:");
        int t=sc.nextInt();
        for(int i=0;i<t;i++)//Here this loop takes 10^4
        {
            int n=sc.nextInt();
            int count=0;

            for(int div=2 ;div*div<=n;div++)//here div*div bcz of test case is less than or equal to root n.
            {
                if(n%div==0)
                {
                    count ++;
                    break;   //bcz if i/p is 12 we know that if 12 is divisible by 2 then no need to proceed
                    //bcz already not a prime no.
                }
            }
            if(count==0)
            {
                System.out.println("Prime");
            }
            else {
                System.out.println("Not Prime");
            }
        }

    }

}