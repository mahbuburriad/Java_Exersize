package reverseNumber;

public class Reverse_Number {

    public static void main(String[] args) {
        int number = 1234, reversed = 0;

        while (number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed Number: "+ reversed);
        System.out.println("Another way reversed: "+ Integer.reverse(number));
    }

}
