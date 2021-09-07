/*
Input: S1 =”fffoxoxoxfxo”, S2 = “fox”;
        Output: 3
        Explanation:
        By removing “fox” starting from index 2, the string modifies to “ffoxoxfxo”.
        By removing “fox” starting from index 1, the string modifies to “foxfxo”.
        By removing “fox” starting from index 0, the string modifies to “fxo”.
        Therefore, the minimum length of string S1 after removing all occurrences of S2 is 3.

        Input: S1 =”abcd”, S2 = “pqr”
        Output: 4
*/
package Strings;
import java.util.Scanner;
public class MinimizeStringUsingSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        while (str1.contains(str2)) {
            String res="";
            int index = str1.indexOf(str2);
            int index1=index+(str2.length());
            if (index>0) {
                res += str1.substring(0, index);
                res += str1.substring(index1);
            }
            else if(index==0){
                res += str1.substring(index1);
            }
            str1=res;
        }
        System.out.println(str1);
        System.out.println(str1.length());
    }
}
