package frequencyCharacter;

import java.util.Scanner;

public class FrequencyCharacterString {
    public static void main(String[] args) {
        //create input object for scanner
        Scanner input = new Scanner(System.in);

        //store user input line
        System.out.printf("Enter a String Line: ");
        String store = input.nextLine();

        //store the user searching character
        System.out.printf("Enter a character: ");
        char search_character = input.next().charAt(0);

        //initialize frequency from 0
        int frequency = 0;

        //search user input character within store function
        for (int i = 0; i < store.length(); i++){
            if (search_character == store.charAt(i)){
                ++frequency;
            }
        }

        System.out.printf("Freqeuncy of %c = %d", search_character, frequency);
    }
}
