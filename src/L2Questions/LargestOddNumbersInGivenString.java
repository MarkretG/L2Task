/**
You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.

A substring is a contiguous sequence of characters within a string.
Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.

 Input: num = "4206"
 Output: ""
 Explanation: There are no odd numbers in "4206".
*/

package L2Questions;
import java.util.Scanner;
public class LargestOddNumbersInGivenString {
    private static String findLargestOddNumbersInGivenString(String str)
    {
        if(Integer.parseInt(str)%2!=0)
        {
            return str;
        }
        int max=Integer.MIN_VALUE;
        int flag=0;
        for (int i=0;i<str.length();i++)
        {
            int num=Character.getNumericValue(str.charAt(i));
            if(num%2!=0&&num>max)
            {
                flag=1;
                max=num;
            }
        }
        if(flag==0)
        {
            System.out.println("string does not have odd letters");
            return " ";
        }
        return String.valueOf(max);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String res=findLargestOddNumbersInGivenString(str);
        System.out.println(res);
    }
}
