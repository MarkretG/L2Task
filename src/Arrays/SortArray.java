/**
input:[17,85,23,60]
output:[23,60,17,85]
Note:no additional array.....if two no's has same sum,smaller should be first

*/

package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class SortArray {
    private static  int getSumOfDigits(int num)
    {
        int sum=0;
        while ( num>0)
        {
            int rem= num%10;
            sum+=rem;
            num= num/10;
        }
        return  sum;
    }
    private static void swap(int i,int j,int[] arr)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            int index=0;
            int min=getSumOfDigits(arr[i]);
            for(int j=i+1;j<size;j++) {
                int num=getSumOfDigits(arr[j]);
                if (num< min) {
                    min = num;
                    index=j;
                }
                 else if(num==min)
                {
                    if(arr[i]>arr[j])
                    {
                        swap(i,j,arr);
                    }
                }

            }
            if(index!=0) {
                swap(i, index, arr);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
