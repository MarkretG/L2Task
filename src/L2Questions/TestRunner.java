package L2Questions;

import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("1.print X pattern");
            System.out.println("2.weight based sort");
            System.out.println("3.sub string index");
            System.out.println("4.find number of grand children");
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1: {
                    System.out.println("enter string");
                    sc.nextLine();
                    String input = sc.nextLine();
                    XPattern.printXPattern(input, input.length());
                }
                    break;
                case 2: {
                    int[] inputArray = ArrayUtil.getArrayUtil();
                    Sort.creteWeightBasedArray(inputArray);
                }
                    break;

                case 3: {
                    System.out.println("enter the string");
                    sc.nextLine();
                    String str = sc.nextLine();
                    TwoDimensional.findSubStringIndex(str);
                }
                    break;
                case 4: {
                    System.out.println("enter  the father name");
                    sc.nextLine();
                    String name = sc.nextLine();
                    FatherChildTwoDimensional.findGrandChildren(name);
                }
                break;

            }

        }
    }
}
