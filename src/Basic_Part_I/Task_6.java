package Basic_Part_I;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber ));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber ));
        System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber ));
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber ));
        System.out.println(firstNumber + " mod  " + secondNumber + " = " + (firstNumber % secondNumber) );


    }
}
