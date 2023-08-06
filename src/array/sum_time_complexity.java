//Find the sum of n nos from 1 to n with considering time complexity
package array;

import java.util.Scanner;

public class sum_time_complexity {
    int sum(int n)
    {
        int ans=(n*(n+1))/2;
        return ans;
    }
    public static void main(String[] args) {
        sum_time_complexity s=new sum_time_complexity();
        System.out.println("Enter the value of n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The sum of n numbers is:"+s.sum(n));
    }
}
