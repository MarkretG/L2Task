package Arrays;

import java.util.Scanner;

public class maxNumFromNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        int digit= sc.nextInt();
        String str=String.valueOf(num);
        for (int i=0;i<str.length();i++)
        {
            if((str.charAt(i)-48)==digit)
            {
                int max=0;
                for (int j=i+1;j<str.length();j++)
                {
                    int n=str.charAt(j)-48;
                    if(n>max)
                    {
                        max=n;
                    }
                }
                System.out.println(max);
                break;
            }
        }

    }
}
