package L2Questions;
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int space=(s.length()-1)*2;
        char[] arr=new char[s.length()];
        int j=0;
        for(int i=s.length()/2;i<s.length();i++)
        {
            arr[j]=s.charAt(i);
            j++;
        }
        for(int i=0;i<s.length()/2;i++)
        {
            arr[j]=s.charAt(i);
            j++;
        }

        for (int i=0;i<s.length();i++)
        {
            for (int m=0;m<space;m++)
                System.out.print(" ");
            /*if(space>0)
                System.out.format("%1$"+space+"s","");*/
            for(int k=0;k<i+1;k++)
                System.out.print(arr[k]);
            System.out.println();
            space=space-2;
        }
    }
}
