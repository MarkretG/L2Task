package L2Questions;
import java.util.Scanner;

public class ArrayUtil {

    public static int[] getArrayUtil()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        int[] inputArray=new int[size];
        System.out.println("enter input array elements");
        for (int i=0;i<size;i++)
        {
            inputArray[i]= sc.nextInt();
        }
        return inputArray;
    }
}
