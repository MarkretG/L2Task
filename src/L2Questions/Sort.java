package L2Questions;
public class Sort {
    public static void creteWeightBasedArray(int[] inputArray)
    {
        int[] sumArray=new int[inputArray.length];
        for (int i=0;i<inputArray.length;i++)
        {
            int sum=0;
            int sqt=(int) Math.sqrt(inputArray[i]);
            if(sqt*sqt==inputArray[i])
            {
              sum+=5;
            }
            if((inputArray[i]%4==0) && (inputArray[i]%6==0))
            {
                sum+=4;
            }
            if(inputArray[i]%2==0)
            {
                sum+=3;
            }
            sumArray[i]=sum;
        }
        sort(inputArray,sumArray);

    }

    private static void sort(int[] inputArray,int[] sumArray)
    {
        for(int i=0;i<inputArray.length;i++)
        {
            for (int j=0;j<inputArray.length-1-i;j++)
            {
                if(sumArray[j]>sumArray[j+1])
                {
                   int tem=sumArray[j];
                   sumArray[j]=sumArray[j+1];
                   sumArray[j+1]=tem;

                   int temp1=inputArray[j];
                   inputArray[j]=inputArray[j+1];
                   inputArray[j+1]=temp1;
                }
            }
        }
        printArray(inputArray,sumArray);
    }
    /*private static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;

    }

     */
    private static void printArray(int[] inputArray,int[] sumArray)
    {
        for (int i=0;i<inputArray.length;i++)
        {
            System.out.println("<"+inputArray[i]+","+sumArray[i]+">");
        }
    }
}
