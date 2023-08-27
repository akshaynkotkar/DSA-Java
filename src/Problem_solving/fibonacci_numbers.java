//Print first n fibonacci Numbers
package Problem_solving;

import java.util.Scanner;

public class fibonacci_numbers {
    public static void main(String[] args) {
Scanner  sc=new Scanner(System.in);
        System.out.println("Enter the nth number:");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<n;i++)
        {
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
