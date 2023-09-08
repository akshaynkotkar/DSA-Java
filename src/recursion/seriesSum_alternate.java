package recursion;

import java.util.Scanner;

public class seriesSum_alternate {
    int seriesSum_alternate(int n)
    {
        if (n==0) return 0;
        if(n%2==0)
        {
            return seriesSum_alternate(n-1)-n;
        }
        else
           return seriesSum_alternate(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        seriesSum_alternate a=new seriesSum_alternate();
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("The alternate sum is:");
        System.out.println(a.seriesSum_alternate(n));
    }
}
