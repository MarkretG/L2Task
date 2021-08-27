/*
         input:((()
        output:invalid
        input:[{()}]
        output:valid
*/

package L2Questions;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    private static boolean isValid(String str) {
        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++)
        {
            char ch=str.charAt(i);
            if(map.containsKey(ch))
            {
                stack.push(ch);
            }
            else
            {
                if(!stack.empty()&&map.get(stack.peek())==ch)
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();
        if(isValid(input))
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
    }
}
