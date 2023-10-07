// Given number n and digit d .Calculate its frequency.
package Problem_solving;

import java.util.*;

public class digitFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Enter a digit:");
        int d=sc.nextInt();
        int f=getDigitFrequency(n,d);
        System.out.print("Frequency is:");
        System.out.print(f);
    }
    public static int getDigitFrequency(int n,int d)
    {
        int rv=0;
        while(n>0)
        {
            int dig=n%10;
            n=n/10;
            if(dig==d)
            {
                rv++;
            }

        }
        return rv;
    }
}
