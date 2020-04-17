package vowelConstent;

import java.util.Scanner;

public class AlphabetVowelConstent {
    public static void main(String[] args) {
        //create Scanner input
        Scanner input = new Scanner(System.in);

        //take input from user
        System.out.printf("Enter a character: ");
        //store input as character
        char character = input.next().charAt(0);

        //if character is in A E I O U and small letter a e i o u then its vowel otherwise not
        if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U' || character == 'u' || character == 'o' || character == 'i' || character == 'e' || character == 'a'){
            System.out.printf("%c is vowel", character);
        } else {
            System.out.printf("%c is constant", character);
        }
    }
}
