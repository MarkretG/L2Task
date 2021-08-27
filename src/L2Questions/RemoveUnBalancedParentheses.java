package L2Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
public class RemoveUnBalancedParentheses {
    private static void  removeUnbalancedParentheses(String str)
    {
        List list=new ArrayList();
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>=97&&str.charAt(i)<=122)
            {
                list.add(str.charAt(i));
            }
            else if(str.charAt(i)=='('&&i!=1)
            {
                   if(!stack.empty()&&stack.peek()!='(') {
                       stack.push(str.charAt(i));
                       list.add(str.charAt(i));
                   }
            }
            else if(str.charAt(i)=='(')
            {

            }
            else if(str.charAt(i)==')')
            {
                if(!stack.empty()&&stack.peek()=='(')
                {
                    list.add(str.charAt(i));
                    stack.pop();
                }
            }
        }
        System.out.println(list);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        removeUnbalancedParentheses(input);
    }
}
