package Basic_Part_I;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i =0; i<10; i++){
            System.out.println(number +"x"+ i + " "+ "=" +(number * i) );
        }
    }
}
