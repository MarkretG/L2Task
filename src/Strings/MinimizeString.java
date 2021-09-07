package Strings;
public class MinimizeString {
    public static void main(String[] args) {
        String str1="fffoxoxoxfxo", str2 = "fox";

        for (int i=0;i<str1.length();i++)
        {
            String temp="";
            int count=0;
            for(int j=0;j<str2.length();j++)
            {
                if((i+j)<str1.length()&&str1.charAt(i+j)==str2.charAt(j))
                {
                   count++;
                }
                else
                {
                    break;
                }
            }
            if(count==str2.length())
            {
                for(int k=0;k<str1.length();k++)
                {
                    if(!(k>=i && k<i+str2.length()))
                    {
                        temp+=str1.charAt(k);
                    }
                }
                str1=temp;
                i=-1;
            }

        }
        System.out.println(str1);
        System.out.println(str1.length());

    }
}
