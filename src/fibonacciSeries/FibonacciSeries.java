package fibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        //create input object from user
        Scanner input = new Scanner(System.in);

        //take input from user
        System.out.printf("Enter a integer number: ");
        int number = input.nextInt();

        int first_number = 0;
        int second_number = 1;

        for (int i = 1; i<=number; i++){
            System.out.printf("%d,", first_number);
            int sum = first_number+second_number;
            first_number = second_number;
            second_number = sum;
        }


    }
}
