//Program:Swap two variables without using third variable
package array;

import java.util.Scanner;

public class swap_two_variables {

    void swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(+a);
        System.out.println(+b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        swap_two_variables s=new swap_two_variables();
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        System.out.println("Values of a & b after swapping:"  );
        s.swap(a,b);
    }
}
