package multiplicationTable;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        //create input object for Scanner
        Scanner input = new Scanner(System.in);

        //take input from user
        System.out.printf("Enter a positive number: ");
        int number = input.nextInt();

        //number must not be zero or negative number
        if (number != 0 && number > 0){
            for (int i = 1; i<=10; i++){
                System.out.println(number+" x "+i+" = "+number*i);
            }
        } else if (number < 0){
            System.out.println("You entered negaive number");
        } else {
            System.out.println("You entered 0");
        }
    }
}
