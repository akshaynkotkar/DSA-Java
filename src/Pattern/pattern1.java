/* Print a patetrn
Take input as 5
and print
*
* *
* * *
* * * *
* * * * *
 */
package Pattern;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int n= sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
