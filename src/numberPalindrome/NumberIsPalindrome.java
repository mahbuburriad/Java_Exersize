package numberPalindrome;

import java.util.Scanner;

public class NumberIsPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //take input from user
        System.out.printf("Enter a number: ");
        int number = input.nextInt();

        int temp = number;

        int reverse = 0;

        while (number != 0){
            int digit = number%10;
            reverse = reverse*10+digit;
            number/=10;
        }
        System.out.println("Reverse Number is \n"+reverse);

        if (temp == reverse){
            System.out.printf("%d is Palindrome", temp);
        } else {
            System.out.printf("%d is not palindrome", temp);
        }
    }
}
