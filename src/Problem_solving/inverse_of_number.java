package Problem_solving;

import java.util.Scanner;

public class inverse_of_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int inv=0;
        int op=1;
        while(n!=0)
        {
            int od=n%10;
            int id=op;
            int ip=od;
            //make change to inv using ip and id
            inv=inv+id*(int)Math.pow(10,ip-1);
            n=n/10;
            op++;
        }
        System.out.println("The inverted output of a number is:"+inv);
    }
}
