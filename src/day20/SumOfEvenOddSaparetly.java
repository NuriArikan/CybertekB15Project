package day20;

public class SumOfEvenOddSaparetly {
    public static void main(String[] args) {

        int sumOdd = 0;
        int sumEven = 0;

        for (int x = 10; x <= 100; x++) {


            if (x % 2 == 1) {     // odd number

                sumOdd = sumOdd + x;

            }else {
                sumEven = sumEven + x;   // even number
            }



        }

        System.out.println(sumOdd+sumEven);






    }
}
