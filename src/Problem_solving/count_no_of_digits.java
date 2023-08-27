//To print no. of digits available in a input number
package Problem_solving;

import java.util.Scanner;

public class count_no_of_digits {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=Sc.nextInt();
        int dig=0;
        while(n!=0)
        {
            n=n/10;
            dig++;
        }
        System.out.println("Total no of digits in a given number is:"+dig);
    }
}
