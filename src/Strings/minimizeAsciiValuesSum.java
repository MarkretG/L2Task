/*
Input: str = “geeksforgeeks”
        Output: 977
        ‘g’ occurs twice -> 2 * 103 = 206
        ‘e’ occurs 4 times -> 4 * 101 = 404
        ‘k’ occurs twice -> 2 * 107 = 214
        ‘s’ occurs twice -> 2 * 115 = 230
        ‘f’ occurs once -> 1 * 102 = 102
        ‘o’ occurs once -> 1 * 111 = 111
        ‘r’ occurs once -> 1 * 114 = 114
        Total sum = 1381
        In order to minimize the sum, remove all the occurrences of ‘e’ from the string
        And the new sum becomes 1381 – 404 = 977
        Input: str = “abcd”
        Output: 294
*/
package Strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class minimizeAsciiValuesSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<Character,Integer> map=new HashMap<>();
        String str=sc.next();
        for(int i=0;i<str.length();i++)
        {
            if(!map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),0);
            }
            map.put(str.charAt(i),map.get(str.charAt(i))+1);
        }
        int sum=0;
        int max=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            int currentSum= entry.getKey()*entry.getValue();
            sum+=entry.getKey()*entry.getValue();
            if(currentSum>max)
            {
                max=currentSum;
            }
            /*if(entry.getValue()>=max)
            {
                max=entry.getValue();
                minimize=entry.getKey()*max;
            }*/
        }
        System.out.println(sum);
        System.out.println(sum-max);
    }
}
