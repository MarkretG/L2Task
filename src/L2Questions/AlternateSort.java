///input: 1 8 10 7 6 3
///output:1 10 3 8 6 7


package L2Questions;

import java.util.Arrays;

public class AlternateSort {
    public static void main(String[] args) {
        int[] inputArray={1,8,10,7,6,3};

        Arrays.sort(inputArray);
        int min=0,max=inputArray.length-1;
        for(int i=0;i<inputArray.length;i++)
        {
            if(i%2!=0)
            {
                System.out.println(inputArray[max--]);
            }
            else {
                System.out.println(inputArray[min++]);
            }
        }
    }
}
