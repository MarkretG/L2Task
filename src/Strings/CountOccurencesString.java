/**Input S = ”abcdefdefabc”, X = ”def”, Y = ”abc”
        Output: 0 2
        Explanation:
        First occurence of Y(= “abc”): No of occurrences of X(= “def”) = 0.
        Second occurrence of Y: No of occurrences of X = 0.

        Input: S = ”accccbbbbbbaaa”, X = ”b”, Y = ”a”
        Output: 0 6 6 6*/
package Strings;
import java.util.Scanner;
public class CountOccurencesString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String x = sc.next();
        String y = sc.next();
        while (str.contains(y)) {
            String m = "";
            int count = 0;
            int index = str.indexOf(y);
            if (index == 0) {
                System.out.println(count);
                for (int k = y.length(); k < str.length(); k++) {
                    m += str.charAt(k);
                }
            }
            else {
                m += str.substring(0, index);
                int j=0;
                while (j<m.length())
                {
                    if (m.substring(j, j+x.length()).equals(x)) {
                        count++;
                        j+=x.length();
                    }
                    else {
                        j++;
                    }
                }
                if(index+x.length()<str.length())
                {
                    m+=str.substring(index+x.length());
                }
                System.out.println(count);
            }
            str=m;
        }
    }
}