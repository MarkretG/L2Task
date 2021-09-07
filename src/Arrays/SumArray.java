package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] arr=new int[size];
        int[] result=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            int sum=0;

                if(i!=size-1)  {
                    for (int j = i + 1; j < size; j++) {
                        sum += arr[j];
                    }
                }
                if(i!=0) {
                    for (int k = 0; k < i; k++) {
                        sum += arr[k];
                    }
                }
            result[i]=sum;
        }
        System.out.println(Arrays.toString(result));
    }
}
