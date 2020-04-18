package factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //create input object for Scanner
        Scanner input = new Scanner(System.in);

        //take input from user and store into a value
        System.out.printf("Enter a positive integer number: ");
        int number = input.nextInt();

        int factorial = 1, i;

        for (i = number; i>=1; i--){
            factorial*=i;
        }
        System.out.printf("\n%d! = %d", number, factorial);


    }

}
