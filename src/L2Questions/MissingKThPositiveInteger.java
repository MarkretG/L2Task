package L2Questions;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MissingKThPositiveInteger {
    private static int getMissingKthPositiveInteger(int[] arr,int k)
    {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<1000;i++) {
            list.add(i);
        }
        int j=0;
        while (j< arr.length) {
            list.remove((Integer)arr[j]);
            j++;
        }
        return (int) list.get(k-1);
    }
    public static void main(String[] args) {
        int k=101;
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int missingElement=getMissingKthPositiveInteger(arr,k);
        System.out.println(missingElement);


    }
}
