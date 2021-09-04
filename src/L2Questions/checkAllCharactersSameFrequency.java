/**Given a string s, return true if s is a good string, or false otherwise.
        A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).
        Input: s = "abacbc"
        Output: true
        Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.*/
package L2Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class checkAllCharactersSameFrequency {
    private static boolean checkAllCharactersSameFrequency(String str)
    {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        int frequency=map.get(str.charAt(0));
        for(int i=0;i<str.length();i++)
        {
          if(map.get(str.charAt(i))!=frequency)
              return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str= scanner.nextLine();
        boolean res=checkAllCharactersSameFrequency(str);
        System.out.println(res);

    }
}
