/*
input:["flower","fly","flight"]
output:"fl";
no common prefix print:""
*/

package L2Questions;
import java.util.Scanner;
public class LongestCommonPrefix {
    private static String  findLongestCommonPrefix(String[] strArray,int prefixLength,int size)
    {
        int k=0;
        String str="";
        for (int i=0;i<prefixLength;i++)
        {
            int count=1;
            for (int j=0;j<size-1;j++) {
                if (strArray[j].charAt(i)==strArray[j+1].charAt(i))
                {
                    count++;
                }
            }
            if(count==strArray.length)
                str+=strArray[k].charAt(i);
            else
                break;
        }
        return  str;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        String[] strArray=new String[size];
        scanner.nextLine();
        for (int i=0;i<size;i++)
        {
            strArray[i]=scanner.nextLine();
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<size;i++)
        {
            if(strArray[i].length()<min)
                min=strArray[i].length();
        }
        String str=findLongestCommonPrefix(strArray,min,size);
        System.out.println(str);
    }
}
