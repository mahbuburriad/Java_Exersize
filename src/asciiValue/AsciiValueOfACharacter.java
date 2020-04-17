package asciiValue;

import java.util.Scanner;

public class AsciiValueOfACharacter {
    public static void main(String[] args) {
        //create input object for scanner;

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a character: ");
        //store the value of user entered character in c variable
        char c = input.next().charAt(0);

        //convert to ascii by integer
        int castAscii = (int) c;

        System.out.printf("The ASCII value of %c is %d", c, castAscii);


    }
}
