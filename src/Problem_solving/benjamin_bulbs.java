package Problem_solving;

import java.util.Scanner;

public class benjamin_bulbs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        for(int i=1;i*i<=n;i++)
        {
            System.out.println(i*i);
        }
    }
}
