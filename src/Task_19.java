import java.util.*;

public class Task_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("get number ");
        Integer number = input.nextInt();
        List<Integer> resultList = createListOfElement(number);

        //Iterator<Integer> resultListIterator = resultList.iterator();
        //while(resultListIterator.hasNext())
        //{
        //    Integer item = resultListIterator.next();

        //    System.out.println(item);
        //}

        System.out.println(simpleBinayConverter(number));
        // ArrayList<Integer> powers = new ArrayList<>();
        // powers.add(findNumb(25));
    }

    public static void findNumb(int number) {
        //int x = 2;
        int y = 0;

        do {
            System.out.println(Math.pow(2, y));
            y++;
        } while (number >= Math.pow(2, y));


    }

    public static  String simpleBinayConverter(int number)
    {
        String returnBinaryString = "";
        int powerIndex = 0;

        while(number >= Math.pow(2, powerIndex ))
        {
            powerIndex++;
        }

        int possibleSum = 0;
        int currentSum = 0;

        for(int index = powerIndex - 1; index >= 0; index--)
        {
            possibleSum += (int)Math.pow(2, index) ;
            if(possibleSum <= number)
            {
                returnBinaryString += "1";
                currentSum = possibleSum;
            }
            else
            {
                returnBinaryString += "0";
                possibleSum = currentSum;
            }
        }

        return returnBinaryString;
    }



    public static List<Integer> createListOfElement(int number)
    {
        List<Integer> result = new ArrayList<>();
        int maxPossiblePower = 0;
        do {
            result.add((int)Math.pow(2, maxPossiblePower++));
        } while (number >= Math.pow(2, maxPossiblePower ));

        result.sort(Comparator.reverseOrder());
        return result;
    }
        }










