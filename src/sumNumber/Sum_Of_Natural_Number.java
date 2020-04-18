package sumNumber;

import java.util.Scanner;

public class Sum_Of_Natural_Number {
    public static void main(String[] args) {
        //create a input object from Scanner
        Scanner input = new Scanner(System.in);

        //take input from to To from user
        System.out.printf("Enter where starts from: ");
        int starts = input.nextInt();

        System.out.printf("Enter where to Ends: ");
        int ends = input.nextInt();

        int sum = 0; //sum initialze from 0
        //create for loop for create data from to To continuously
        for (int i = starts; i <= ends; i++){
            sum+=i;
        }
        System.out.printf("The sum From %d to %d is %d",starts, ends, sum);
    }
}
