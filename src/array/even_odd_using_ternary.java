//Print the number is even or odd using ternary operator
package array;

import java.util.Scanner;

public class even_odd_using_ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        String type=(n%2==0)?"Even":"Odd";
        System.out.println(type);
    }
}
