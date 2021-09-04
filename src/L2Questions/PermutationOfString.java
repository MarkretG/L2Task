package L2Questions;

import java.util.Scanner;

public class PermutationOfString {
    private  static  void permute(String str,int l,int r)
    {
        if(l==r)
            System.out.println(str);
        else {
            for(int i=l;i<=r;i++)
            {
                str=swap(str,l,i);
                permute(str,l+1,r);
                str=swap(str,l,i);
            }
        }
    }
    private static String swap(String str,int i,int j)
    {
        char temp;
        char[] chars=str.toCharArray();
        temp=chars[i];
        chars[i]=chars[j];
        chars[j]=temp;

        return String.valueOf(chars);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        permute(str,0,str.length()-1);
    }
}
