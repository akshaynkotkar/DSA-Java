/*
Write a program to check given String is Palindrome or not.
 */
package recursion.String;

import java.util.Scanner;

public class palindromeString {

        public  static String reverse(String s)
        {
            if(s.length()==0) return "";
            String revrese =reverse(s.substring(1));
            char currChar=s.charAt(0);
            return revrese+currChar;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        String reversed=reverse(s);
        if(reversed.equals(s))
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}
