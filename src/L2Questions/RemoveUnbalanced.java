package L2Questions;

import java.util.Scanner;

public class RemoveUnbalanced {
    private  static void removeUnbalanced(char[] chars)
    {
        int len=chars.length-1;
        int i=0;
        int j=len;
        while (i<j) {
            if (chars[i] == '(' && chars[j] == ')')
            {
                i++;
                j--;
            }
            else if (chars[i] == ')' && chars[j] == '(')
            {
                i++;
                j--;
            }
            else if(chars[i]>=97&&chars[i]<=122 &&chars[j]>=97&&chars[j]<=122 )
            {
                i++;
                j--;
            }
            else if(chars[i]>=97&&chars[i]<=122)
            {
                i++;
            }
            else if(chars[j]>=97&&chars[j]<=122)
            {
                j--;
            }
        }
        chars[i]='1';
        for (int k=0;k<len;k++)
        {
            if(i!=1)
            {
                System.out.print(chars[k]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        removeUnbalanced(input.toCharArray());
    }
}
