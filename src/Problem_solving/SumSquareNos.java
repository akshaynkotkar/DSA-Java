package Problem_solving;

import java.util.Scanner;

public class SumSquareNos {
    public int sumSquareNos(int k)
    {
        int start=0;
        int end=(int)Math.sqrt(k);
        while(start<=end)
        {
            int sum=start*start+end*end;
            if(sum==k)
            {
                System.out.println("The possible square nos are "+start+"and "+end);
                return sum;
            } else if (sum>k) {
                end--;
            }
            else
            {
                start++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        SumSquareNos s=new SumSquareNos();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of k:");
        int k= sc.nextInt();
        int sum=s.sumSquareNos(k);
        if(sum==-1)
        {
            System.out.println("Sum of Square no is not possible.");
        }
        else {
            System.out.println("The total is:"+sum);
        }


    }
}
