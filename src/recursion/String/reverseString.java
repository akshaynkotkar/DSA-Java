/*
Write a program to print Reverse of String using Recursion.
Enter a String:
abcde
Output:
edcba
 */
package recursion.String;

import java.util.Scanner;

public class reverseString {
    public  static String reverse(String s)
    {
        if(s.length()==0) return "";
        String revrese =reverse(s.substring(1));
        char currChar=s.charAt(0);
        return revrese+currChar;
    }
    public  static String reverse2(String s,int idx)
    {
        if(idx==s.length()) return "";
        String revrese =reverse2(s,idx+1);
        char currChar=s.charAt(idx);
        return revrese+currChar;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        System.out.println("Reverse string ");
        System.out.println(reverse(s));

        System.out.println(reverse2(s,0));
    }
}
