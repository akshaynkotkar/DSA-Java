//Reverse a number ex:10899
//99801
package array;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n=sc.nextInt();
        while(n>0)
        {
            int lastDigit=n%10;
            System.out.print(lastDigit+" ");
            n/=10;
        }
        System.out.println();
    }
}
