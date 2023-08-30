//Given a number n and a value k print k multiples of n
package recursion;

import java.util.Scanner;

public class multiples {
    static void printMultiples(int n,int k)
    {
        if (k==1)
        {
            System.out.println(n);
            return;
        }
        /*
        or if (k==0){
        return
        }
         */
        printMultiples(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Enter the value of k:");
        int k=sc.nextInt();
        System.out.println("The output Multiples are:");
        printMultiples(n,k);
    }
}
