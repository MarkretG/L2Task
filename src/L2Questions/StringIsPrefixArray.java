package L2Questions;

import java.util.Scanner;

public class StringIsPrefixArray {
    /*private static String convertStringArrayToString(String[] str)
    {
        //convert object array to string
        StringBuilder sb=new StringBuilder();
        for (String st:str)
        {
            sb.append(st);
        }
        return sb.substring(0,sb.length());
    }*/
    private static boolean isStringPrefixOfArray(String[] str,String word)
    {
        String res="";
        int i=0;
        while (res.length()<word.length()&&i< str.length)
        {
            res+=str[i];
            if (res.equals(word))
                return true;
            i++;
        }
        return  false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();
        System.out.println("enter array size");
        int size = sc.nextInt();
        String[] strArray = new String[size];
        sc.nextLine();
        System.out.println("enter array elements");
        for (int i = 0; i < size; i++) {
            strArray[i] = sc.nextLine();
        }
        boolean ans=isStringPrefixOfArray(strArray,str);
        System.out.println(ans);
       /* String s=convertStringArrayToString(strArray);
        System.out.println(s);
        if(s.substring(0,s.length()).equals(str.substring(0,s.length())))
            System.out.println(true);
        else
            System.out.println("false");
*/
    }
}
