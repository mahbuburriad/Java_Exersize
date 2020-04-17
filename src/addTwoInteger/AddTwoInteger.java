package addTwoInteger;

import java.util.Scanner;

public class AddTwoInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //create input object for scanner

        int a, b, sum;

        //create user input first integer
        System.out.printf("Enter the first number: ");
        a = input.nextInt();

        //create user input second integer
        System.out.printf("Enter the second number: ");
        b = input.nextInt();

        //add two number into sum
        sum = a + b;

        //print the sum
        System.out.printf("Sum is %d", sum);
    }
}
