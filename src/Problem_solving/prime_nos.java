//Print all prime numbers till N with considering time complexity
package Problem_solving;

import java.util.Scanner;

public class prime_nos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower input");
        int l=sc.nextInt();
        System.out.println("Enter Higher input:");
        int h=sc.nextInt();
        for(int n=l;n<=h;n++)
        {
            int count =0;
            for(int div=2;div*div<=n;div++)
            {
                if(n%div==0)
                {
                    count ++;
                    break;
                }
            }
if(count==0)
{
    System.out.println(n);
}
        }
    }
}
