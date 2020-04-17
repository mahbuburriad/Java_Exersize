package roundNumber;

import java.util.Scanner;

/*use when using by Decimal format
import java.math.RoundingMode;
import java.text.DecimalFormat;
*/
public class Round_Number_Decimal_Place {
    public static void main(String[] args) {
        //create input object for scanner
        Scanner input = new Scanner(System.in);

        //take input from user and store input into number
        System.out.printf("Enter a number: ");
        double number = input.nextDouble();

        //round a number using format
        System.out.format("%.4f", number);

        //another solution
        //System.out.printf("%.4f", number); //you can use this also

        //another solution
        /*use when using by Decimal format
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(number));
*/
    }
}
