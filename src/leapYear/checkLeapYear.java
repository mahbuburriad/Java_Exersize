package leapYear;

import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args) {
        //create input object for Scanner
        Scanner input = new Scanner(System.in);

        //take input from user and store into year variable
        System.out.printf("Enter a year: ");
        int year = input.nextInt();

        /*
        Condition:
        The year is evenly divisible by 4;
        If the year can be evenly divided by 100, it is NOT a leap year, unless;
        The year is also evenly divisible by 400. Then it is a leap year.
        */

        if( year%4 == 0){
            if (year%100 == 0){
                if (year%400 == 0){
                    System.out.println(year + " is leap year");
                } else {
                    System.out.println(year+" is not leap year");
                }
            }
            else {
                System.out.println(year + " is leap year");
            }
        } else {
            System.out.println(year+ " is not leap year");
        }


    }
}
