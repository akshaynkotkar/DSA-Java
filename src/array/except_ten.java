//Display all numbers entered by user except multiples of 10

package array;

import java.util.Scanner;

public class except_ten {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        do {
            i++;
            System.out.println("Enter a number:");
            int n=sc.nextInt();
            if(n%10==0)
            {
                continue;
            }
            System.out.println("Your number was:"+n);

        }while(i<=10);
    }
}
