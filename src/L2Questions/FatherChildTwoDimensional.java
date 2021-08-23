package L2Questions;
public class FatherChildTwoDimensional {
    public static  void findGrandChildren(String str)
    {
        int count=0;
        String[][] twoDimensional={{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
        int row=4;

        for(int i=0;i<row;i++)
        {
            if(twoDimensional[i][1].equals(str))
            {
                for (int j=0;j<row;j++)
                {
                    if(twoDimensional[i][0].equals(twoDimensional[j][1]))
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
