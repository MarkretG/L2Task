package L2Questions;
public class XPattern {

    public  static void   printXPattern(String str,int len)
    {
      for(int i=0;i<len;i++)
      {
          for(int j=0;j<len;j++)
          {
              if((i==j)||(i+j)==len-1)
              {
                  System.out.print(str.charAt(j));
              }
              else
              {
                  System.out.print(" ");
              }
          }
          System.out.println("");
      }
    }

}
