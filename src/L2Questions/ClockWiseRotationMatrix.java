package L2Questions;
import java.util.Scanner;
public class ClockWiseRotationMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row= sc.nextInt();
        int col=sc.nextInt();
        int[][] mat=new int[row][col];
        int[][] mat1=new int[row][col];
        int m=row,n=col;
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        int r=0,c=0;
        for (int k=0;k<1;k++)
        {
            for (int i=0;i<col;i++)
            {
                for (int j=row-1;j>=0;j--)
                {
                    mat1[r][c]=mat[j][i];
                }
            }
        }


        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(mat1[i][j]);
            }
            System.out.println();
        }
    }
}
