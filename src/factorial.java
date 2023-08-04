//Write a Java Program to print factorial value of given Number.
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        int i = 1;
        int factorial = 1;
        while(i<=n){
            factorial *= i;
            i++;
        }
        System.out.print("The factorial value is:"+factorial);
    }
}
