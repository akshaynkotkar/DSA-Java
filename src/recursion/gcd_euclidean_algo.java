//Find the gcd using Euclidean algorithm
package recursion;

import java.util.Scanner;

public class gcd_euclidean_algo {
    int gcd(int x,int y)
    {
        if(y==0) return x;
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        gcd_euclidean_algo g=new gcd_euclidean_algo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x:");
        int x=sc.nextInt();
        System.out.println("Enter value of Y:");
        int y= sc.nextInt();
        System.out.println("GCD is:"+g.gcd(x,y));
    }
}
