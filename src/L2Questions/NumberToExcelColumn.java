package L2Questions;

import java.util.Scanner;

public class NumberToExcelColumn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++) {
            int num = sc.nextInt();
            int temp = num;
            String str="";
            while (temp > 0) {
                int rem = temp % 26;
                char val = (char) ('A' + (rem - 1));
                if (rem == 0) {
                    str += "Z";
                    temp = (temp / 26) - 1;
                } else {
                    str += val;
                    temp = temp / 26;
                }
            }
            StringBuilder stringBuilder = new StringBuilder(str);
            System.out.println(stringBuilder.reverse());
        }
    }
}
