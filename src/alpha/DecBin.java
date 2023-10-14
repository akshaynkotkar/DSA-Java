package alpha;

import java.util.Scanner;

public class DecBin {
    public static void decToBin(int n)
    { int orgDec=n;
        int pow=0;
        int binNum=0;
        while(n>0)
        {
            int rem=n%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary form of: "+orgDec+" = "+binNum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number in binary:");
        int b=sc.nextInt();
        decToBin(b);

    }
}
