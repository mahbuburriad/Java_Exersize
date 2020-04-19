package countNumberDigit;

import java.util.Scanner;

public class count_Number_Digit_Integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0, i;

        //take input from user
        System.out.print("Enter a integer number: ");
        int number = input.nextInt();

        while (number != 0){
            number /= 10;
            count++;
        }
        System.out.printf("Number of digit %d", count);

    }
}
