package Problem_solving;

import java.util.Scanner;

/*
633. Sum of Square Numbers

Medium
Topics

Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.



Example 1:

Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5
Example 2:

Input: c = 3
Output: false


Constraints:

0 <= c <= 231 - 1
 */
public class SumSquareNosTrueFalse {
    public static boolean judgeSquareSum(int c) {
        int start=0;
        int end=(int)Math.sqrt(c);
        while(start<=end)
        {
            long sum=(long)start*start+(long)end*end;
            if(sum==c)
            {
                return true;
            }
            else if(sum>c)
            {
                end--;
            }
            else
            {
                start++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(judgeSquareSum(n));
    }
}
