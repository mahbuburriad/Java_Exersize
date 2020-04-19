package primeNumber;

public class PrimeNumberTwoIntervel {
    public static void main(String[] args) {
        int low = 20; int high = 50;

        while (low < high){
            boolean flag = false;

            for (int i = 2; i <= low/2; ++i){
                //condition for nonprime number
                if (low % i == 0){
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println(low+" ");
            ++low;
        }
    }
}
