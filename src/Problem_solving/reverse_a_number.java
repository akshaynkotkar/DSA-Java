package Problem_solving;

import java.util.Scanner;

public class reverse_a_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        while(n>0)
        {
            int dig=n%10;
            n=n/10;
            System.out.println(dig);
        }
    }
}
