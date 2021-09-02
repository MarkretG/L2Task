package L2Questions;
import java.util.Scanner;
public class ExcelColumnToNumber {
    private  static int convertExcelColumnNameToDecimal(String str)
    {
        int result=0;
        for (int i=0;i<str.length();i++)
        {
          result*=26;
          result+= str.charAt(i)-'A'+1;
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int ans=convertExcelColumnNameToDecimal(str);
        System.out.println(ans);
    }
}
