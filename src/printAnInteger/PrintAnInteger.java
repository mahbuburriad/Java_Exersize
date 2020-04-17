package printAnInteger;

import java.util.Scanner;

public class PrintAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //create input object for scanner

        System.out.print("Please type an integer: ");
        int a = input.nextInt(); //store user input value to a variable
        input.close(); //close user input

        System.out.println("You Type: "+ a); //print the user entered value
    }
}
