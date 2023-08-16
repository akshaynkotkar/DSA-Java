//Given an integer,find out the sum of its digits using recursion
package recursion;

import java.util.Scanner;

public class SumDigits {
    int SumOfDigits(int n)
    {
        if(n>=0 && n<=9) return n;
        return SumOfDigits(n/10)+n%10;
        /*
        or
        int SmallAns=SumOfDigits(n/10);

        int ans=SmallAns=n%10;
        return ans;
         */
    }
    public static void main(String[] args) {
        SumDigits s=new SumDigits();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.print("Addition is:"+s.SumOfDigits(n));
    }
}
