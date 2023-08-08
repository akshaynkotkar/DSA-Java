//Find the value of factorial n
package recursion;

import java.util.Scanner;

public class factorial_recursion {
    int fac(int n)
    {
        if(n==1) return 1;

        return n*fac(n-1);
        /*
        or
        int small=fac(n-1);
        int ans=n*small;
        return ans;
         */
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        factorial_recursion r=new factorial_recursion();
        System.out.println("Enter te value of n:");
        int n= sc.nextInt();;
        System.out.println("Factorial of "+n +" is:"+r.fac(n));

    }
}
