package removeWhiteSpace;

import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        //create input object for Scanner
        Scanner input = new Scanner(System.in);

        //take a String input from user and store into string
        System.out.printf("Enter a string: ");
        String string = input.nextLine();

        //take a variable that stores space
        String white_space_remove = string.replaceAll("\\s", "");
        System.out.printf("After replacement: %s", white_space_remove);
    }
}
