/*
Write a program Count ways to reach the nth stair. The person can climb either 1 or 2 stairs
at a time
 */
package DP;

import java.util.Scanner;
import java.util.Arrays;
public class ClimbingStairs {
    //Using Recursion
    public static int countWays(int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return  0;
        }
        return countWays(n-1)+countWays(n-2);
    }
    //Using Memorization DP
    public static int countWaysMem(int n,int ways[])
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return  0;
        }
        if(ways[n]!=-1)
        {
            return ways[n];
        }
        ways[n]= countWaysMem(n-1,ways)+countWaysMem(n-2,ways);
        return  ways[n];
    }
    //Using Tabulation
    public static int countWaysTab(int n)
    {
        int dp[]=new int[n+1];
       dp[0]=1;
        //Tabulation Loop
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                dp[i]=dp[i-1]+0;
            }
            else {

                dp[i]=dp[i-1]+dp[i-2];
            }
        }
       return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        System.out.println("Using Recursion:"+countWays(n));
        int ways[]=new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println("Using Memorization:"+countWaysMem(n,ways));
        System.out.println("Using Tabulation:"+countWaysTab(n));
    }
}
