package Problem_solving;

import java.util.Scanner;

public class gcd_lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first Number:");
        int n1=sc.nextInt();
        System.out.println("Enter a second number:");
        int n2=sc.nextInt();
        int original_n1=n1;
        int original_n2=n2;
        while(n1%n2!=0)
        {
            int rem=n1%n2;
            n1=n2;
            n2=rem;

        }
        int gcd=n2;
        System.out.println("The gcd of "+original_n1+" and "+original_n2+" is: "+gcd);
        int lcm=(original_n1*original_n2)/gcd;
        System.out.println("The lcm of "+original_n1+" and "+original_n2+" is: "+lcm);
    }
}
