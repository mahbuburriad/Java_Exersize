package evenOdd;

import java.util.Scanner;

public class NumberEvenOff {
    public static void main(String[] args) {
        //create input object for scanner
        Scanner input = new Scanner(System.in);

        //Take number from user
        System.out.printf("Enter a number: ");
        //store user entered number to input
        int number = input.nextInt();
        input.close();

        // if number divided by 2 but have not reminder then even otherwise odd
        if (number%2 == 0){
            System.out.printf("%d is Even", number);
        } else {
            System.out.printf("%d is ODD", number);
        }
    }
}
