package numberSwap;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        //create a object for scanner
        Scanner input = new Scanner(System.in);

        //take user input for number1;
        System.out.printf("Enter Number1: ");
        int number1 = input.nextInt(); //store user data to number1

        //take user input for number 2
        System.out.printf("Enter Number 2: ");
        //store user data to number 2
        int number2 = input.nextInt();

        //keep number1 data to a temp variable
        int temp = number1;
        //restore number2 data to number1
        number1 = number2;
        //restore temp data to number2
        number2 = temp;

        //print value
        System.out.printf("After swap Number1: %d and Number2: %d", number1, number2);
    }
}
