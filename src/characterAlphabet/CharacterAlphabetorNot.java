package characterAlphabet;

import java.util.Scanner;

public class CharacterAlphabetorNot {
    public static void main(String[] args) {
        //create input object for scanner
        Scanner input = new Scanner(System.in);

        //take input from user and store in variable character
        System.out.printf("Enter a character: ");
        char character = input.next().charAt(0);

        //check character is Alphabet or not
        if(( character > 'a' && character < 'z') || ( character > 'A' && character < 'Z')){
            System.out.printf("%c is Alphabet", character);
        } else {
            System.out.printf("%c is not Alphabet", character);
        }
    }
}
