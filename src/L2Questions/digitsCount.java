/*
input:13    1-9=9...10-13=8
Output:17
*/

package L2Questions;
import java.util.Scanner;

public class digitsCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int count=0;
        for (int i=1;i<=num;i++)
        {
            int temp=i;
            count++;
            while ((temp/10)>0)
            {
                count++;
                temp=temp/10;
            }
        }
        System.out.println(count);

    }
}
