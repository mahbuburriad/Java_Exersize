package gcd;

import java.util.Scanner;

public class GCD_Two_Number {
    public static void main(String[] args) {
        //create input object from scanner
        Scanner input = new Scanner(System.in);

        int gcd =1;

        //input two number from user
        System.out.printf("Enter Number 1: ");
        int number1 = input.nextInt();

        System.out.printf("Enter Number 2: ");
        int number2 = input.nextInt();

        for (int i = 1; i <= number1 && i<=number2; ++i){
            //check if i is factor of both integers
            if (number1 % i == 0 && number2 % i == 0){
                gcd = i;
            }
        }
        System.out.printf("G.C.D of %d and %d is %d", number1, number2, gcd);

    }
}
