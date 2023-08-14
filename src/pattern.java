//Write a java program to print star pattern.
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i,j;
        System.out.println("Enter the value of row:");
        int row=in.nextInt();
        for(i=1;i<=row;i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
