package L2Questions;

import java.util.Scanner;

public class SlidingWindow {
    private  static void slidingWindow(int[] arr,int k)
    {
        for (int i=0;i<arr.length-2;i++)
        {
            int max=arr[i];
            for (int j=i+1;j<k+i;j++)
            {
                if (arr[j]>max)
                    max=arr[j];
            }
            System.out.print(max);

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr=new int[size];

        System.out.println("enter k");
        int k=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        slidingWindow(arr,k);

    }
}
