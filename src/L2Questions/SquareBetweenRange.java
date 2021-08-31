package L2Questions;

public class SquareBetweenRange {
    public static void main(String[] args) {
        int a=20,b=100;
        for(int i=a;i<=b;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if (j*j==i)
                    System.out.println(i);
            }
        }
    }
}
