package largestNumber;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        //create input object for scanner
        Scanner input = new Scanner(System.in);

        //take user input for three number
        System.out.printf("Enter Number1: ");
        //store first number to number1
        int number1 = input.nextInt();

        System.out.printf("Enter Number2: ");
        int number2 = input.nextInt();

        System.out.printf("Enter Number3: ");
        //store third number to number3
        int number3 = input.nextInt();

        //check number number1 greater than number2 and number3
        if (number1 > number2 && number1 > 3){
            System.out.printf("%d is largest", number1);
        } else if (number2 > number1 && number2 > number3) { //check number2 greater than number1 and number3
            System.out.printf("%d is largest", number2);
        } else {
            System.out.printf("%d is largest", number3); //otherwiser number3 is largest
        }
    }
}
