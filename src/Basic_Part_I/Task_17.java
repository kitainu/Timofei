package Basic_Part_I;

import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first binary number:");
        int firstNumb = input.nextInt();
        System.out.println("Input second binary number:");
        int secondNumb = input.nextInt();

        int result = firstNumb + secondNumb;

        System.out.println(Integer.toBinaryString(firstNumb) + " + " + Integer.toBinaryString(secondNumb) + " = " + Integer.toBinaryString(result));
    }

}
