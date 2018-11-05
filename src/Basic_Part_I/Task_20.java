package Basic_Part_I;

import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("get the  number");
       Integer number = input.nextInt();
//Task_20.nextNumb(input.nextInt(),-1);
        int currentNumb=0;
        int futureNumb=0;
        int y =0;
        int s =0;

        while( y<=0){
           s +=Math.pow(2,y);
               if(s<=number){
                   currentNumb =futureNumb;
                   System.out.println("1");

               }else{
                   futureNumb=currentNumb;
                   System.out.println("0");
               }
            }
        }


    public static int nextNumb(int number, int y){
        // pętla while liczy y
        //2^0, 2^1 itd
        while(number>=Math.pow(2,y++)){

            System.out.println(Math.pow(2,y));

        }
         int result=(int)Math.pow(2,y++);
        return result;
    }

}
