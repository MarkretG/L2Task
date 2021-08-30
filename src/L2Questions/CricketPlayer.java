package L2Questions;
import java.util.Scanner;
public class CricketPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9,10,11};
        int[] runs=new int[11];
        int i=0;
        while (i<11)
        {
            int balls=6;
            int count=0;
            int run=0;
            while (count<balls) {
                String ch = scanner.nextLine();
                switch (ch) {
                    case "1":
                        run += Integer.parseInt(ch);
                        runs[i++]=run;
                        count++;
                    case "2":
                        run += Integer.parseInt(ch);
                        runs[i]=run;
                        count++;
                    case "3":
                        run += Integer.parseInt(ch);
                        runs[i++]=run;
                        count++;
                    case "4":
                        run += Integer.parseInt(ch);
                        runs[i]=run;
                        count++;
                    case "5":
                        run += Integer.parseInt(ch);
                        runs[i++]=run;
                        count++;
                    case "6":
                        run += Integer.parseInt(ch);
                        runs[i]=run;
                        count++;
                    case "wicket":

                        count++;
                    case "wide":
                        balls++;
                }
            }
            i++;
            System.out.println("player"+arr[i]+"run"+runs[i]);

            }
        }

}
