/*
input:["a","ab","abc","d"]     word="abc"
output:3   subString count
*/

package L2Questions;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberSubStringInGivenString {
    private  static  int getNumberOfSubStringInGivenString(String[] strArray,String str)
    {
        int count=0;
        Set<String> set=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            String temp="";
            for(int j=i;j<str.length();j++)
            {
                temp+=str.charAt(j);
                set.add(temp);
            }
        }
        for (int i=0;i<strArray.length;i++)
        {
            if(set.contains(strArray[i]))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        String[] strArray=new String[size];
        sc.nextLine();
        for (int i=0;i<size;i++)
        {
            strArray[i]=sc.nextLine();
        }
        System.out.println("enter string");
        String str= sc.nextLine();
        int count=getNumberOfSubStringInGivenString(strArray,str);
        System.out.println(count);
    }
}
