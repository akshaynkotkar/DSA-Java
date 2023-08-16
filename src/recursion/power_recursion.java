//Given two numbers p & q ,find the value p^q using a recursion function.
package recursion;

import java.util.Scanner;

public class power_recursion {
    static  int pow(int p,int q)
    {
        if(q==0) return 1;
        int smallPow=pow(p,q/2);
        if(q%2==0)
        {
            return smallPow*smallPow;
        }
        return p*smallPow*smallPow;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base value:");
        int p=sc.nextInt();
        System.out.println("Enter base value:");
        int q=sc.nextInt();
        System.out.print("The power of "+p +" and "+q +" is:"+pow(p,q));

    }
}
