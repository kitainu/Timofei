import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("put first binary number");
        int firstNumb = input.nextInt();
        System.out.println("put first binary number");
        int secondNumb = input.nextInt();
      int result = firstNumb*secondNumb;
      System.out.println(Integer.toBinaryString(result) + "=" + (Integer.toBinaryString(firstNumb) + "*" +  Integer.toBinaryString(secondNumb)) );
   }

}
