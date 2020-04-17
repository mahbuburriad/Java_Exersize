package quotientReminder;

import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args) {
        //create input object for scanner
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a number: ");
        //store user input number to number1
        int number1 = input.nextInt();

        System.out.printf("Enter Number 2: ");
        //store user input second number in number2
        int number2 = input.nextInt();

        //quotient as integer of number1 and number2
        int quotient = number1/number2;

        //reminder as int of number
        int reminder = number1%number2;

        //print the quotient and reminder
        System.out.printf("Quotient of %d and %d is %d\nReminder is: %d", number1, number2, quotient, reminder);
    }
}
