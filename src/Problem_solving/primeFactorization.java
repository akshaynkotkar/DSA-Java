package Problem_solving;

import java.util.Scanner;

public class primeFactorization {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N:");
        int n=sc.nextInt();
        for (int div =2;div*div<=n;div++)
        {
            while(n%div==0)
            {
                n=n/div;
                System.out.println(div);
            }
        }
        if(n!=1)
        {
            System.out.println(n);
        }
    }
}
