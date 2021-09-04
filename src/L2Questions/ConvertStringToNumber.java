/**
input:iiii k=2....9999->9+9+9+9=36-->3+6=9
output:9
*/

package L2Questions;
import java.util.Scanner;
public class ConvertStringToNumber {
    private static int convertStringToNumber(String str,int k)
    {
        StringBuilder sb=new StringBuilder();
        for (char ch:str.toCharArray())
        {
            sb.append((ch-'a')+1);
        }
        String s=sb.toString();
        for (int i=0;i<k;i++)
        {
            s=sumOfDigits(s);
        }
        return Integer.valueOf(s);
    }
    private static String sumOfDigits(String str)
    {
      int sum=0;
      for (char ch:str.toCharArray())
      {
          sum+=ch-'0';
      }
      return String.valueOf(sum);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter k");
        int k= scanner.nextInt();
        System.out.println("enter string");
        scanner.nextLine();
        String str=scanner.nextLine();
        int num=convertStringToNumber(str,k);
        System.out.println(num);
    }
}
