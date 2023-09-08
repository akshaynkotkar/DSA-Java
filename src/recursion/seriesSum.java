package recursion;

import java.util.Scanner;

public class seriesSum {
    int seriesSum1(int n)
    {
        if(n==0)return 0;
        return seriesSum1(n-1)+n;
    }
    public static void main(String[] args) {
        seriesSum s1=new seriesSum();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number n:");
        int n=sc.nextInt();
        System.out.println("The Series sum is:");
        System.out.println(s1.seriesSum1(n));
    }
}
