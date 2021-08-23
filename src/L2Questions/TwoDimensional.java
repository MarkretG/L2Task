package L2Questions;
public class TwoDimensional {
    public  static void findSubStringIndex(String str)
    {
        int flag=0;
        String subStr="too";
      char[][] inputArray=getTwoDimensionalArray(str);

        for (int i=0;i<inputArray.length;i++)
        {
          for (int j=0;j<subStr.length();j++)
          {
              if((inputArray[i][j]=='t')&&(inputArray[i][j+1]=='o')&&(inputArray[i][j+2]=='o'))
              {
                  flag=1;
                  System.out.println("stat index:"+"<"+i+","+j+">");
                  System.out.println("end index:"+"<"+i+","+(j+2)+">");
                  break;
              }
          }
            if(flag==1)
                break;
      }


        for (int i=0;i<subStr.length();i++)
        {
            for (int j=0;j<inputArray.length;j++)
            {
                    if ((inputArray[i][j] == 'm') && (inputArray[i + 1][j] == 'o') && (inputArray[i + 2][j] == 'o')) {
                        flag = 1;
                        System.out.println("stat index:" + "<" + i + "," + j + ">");
                        System.out.println("end index:" + "<" + (i + 2) + "," + j + ">");
                        break;
                    }
                }
            if(flag==1)
                break;
        }

        if(flag==0)
            System.out.println("sub string not found");
    }
    private static char[][]  getTwoDimensionalArray(String str)
    {
        int row=5;
        int colm=5;
        int k=0;
        char[][] twoDimensionalArray=new char[row][colm];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<colm;j++)
            {
                twoDimensionalArray[i][j]=str.charAt(k);
                if(k<str.length()-1)
                   k++;
            }
        }
        return twoDimensionalArray;

    }
}
