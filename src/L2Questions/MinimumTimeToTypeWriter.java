/*
circular typewritter a-z; initial position =a;
input="abc"
output=5
*/


package L2Questions;
import java.util.Scanner;
public class MinimumTimeToTypeWriter {
    private static int getMinimumTime(String word)
    {
        char initial='a';
        int res=0;
        for (int i=0;i<word.length();i++)
        {
            int diff=word.charAt(i)-initial;
            int diff1=word.charAt(i)-initial;

            res+=Math.min(Math.abs(diff),(26-Math.abs(diff1)))+1;
            initial=word.charAt(i);
        }
        return  res;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int ans=getMinimumTime(str);
        System.out.println(ans);
}
}
