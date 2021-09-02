package L2Questions;

import java.util.Scanner;

public class MatrixRotation {
    private static  void  clockWiseRotate(int[][] mat,int N)
    {
        for (int i=0;i<N/2;i++)
        {
            for(int j=i;j<N-i-1;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[N-1-j][i];
                mat[N-1-j][i]=mat[N-1-i][N-1-j];
                mat[N-1-i][N-1-j]=mat[j][N-1-i];
                mat[j][N-1-i]=temp;
            }
        }
    }
    private static void antiClockWiseRotate(int[][] mat,int N)
    {
        for(int i=0;i<N/2;i++)
        {
            for(int j=i;j<N-i-1;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][N-1-i];
                mat[j][N-1-i]=mat[N-1-i][N-1-j];
                mat[N-1-i][N-1-j]=mat[N-1-j][i];
                mat[N-1-j][i]=temp;
            }
        }
    }
    private static void print(int N,int[][] mat)
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        int[][] mat=new int[N][N];
        for(int i=0;i<N;i++)
        {
            for (int j=0;j<N;j++)
            {
                mat[i][j]= scanner.nextInt();
            }
        }

            antiClockWiseRotate(mat, N);
        print(N,mat);
}
}
