package positiveNegativeNumber;

import java.util.Scanner;

public class Check_positive_negative_number {
    public static void main(String[] args) {
        //create input object for Scanner
        Scanner input = new Scanner(System.in);

        //take input number from user
        System.out.printf("Enter a integer number: ");
        int number = input.nextInt();

        //check number is positive or negative
        if (number < 0){
            System.out.printf("%d is negative number", number);
        } else if (number > 0){
            System.out.printf("%d is positive number", number);
        } else {
            System.out.printf("You entered 0");
        }
    }

}
