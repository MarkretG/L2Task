package L2Questions;
import java.util.Scanner;
public class RomanToDecimal {
    private static int value(char c)
    {
        if(c=='I')
            return 1;
        else if(c=='V')
            return 5;
        else if(c=='X')
            return 10;
        else if(c=='L')
            return 50;
        else if(c=='C')
            return 100;
        else if(c=='D')
            return 500;
        else if(c=='M')
            return 1000;
      return -1;
    }
    private  static int convertRomanToDecimal(String str)
    {
        int ans=0;
        for (int i=0;i<str.length();i++) {
            int num1 = value(str.charAt(i));
            if (!((i + 1) < str.length())) {
                ans += num1;
            } else {
                int num2 = value(str.charAt(i + 1));
                if (num1 >= num2) {
                    ans += num1;
                } else {
                    ans += num2 - num1;
                    i++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int result=convertRomanToDecimal(str);
        System.out.println(result);
    }
}
