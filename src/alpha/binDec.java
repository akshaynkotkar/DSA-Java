package alpha;

import java.util.Scanner;

public class binDec {
    static void binToDec(int binNum)
    {
        int orgBin=binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0)
        {
            int lastDigit=binNum%10;
            decNum=decNum+(lastDigit*(int) Math.pow(2,pow));
            pow++;
            binNum=binNum/10;

        }
        System.out.println("Decimal of "+orgBin+" = "+decNum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int n=sc.nextInt();
    binToDec(n);
    }
}
