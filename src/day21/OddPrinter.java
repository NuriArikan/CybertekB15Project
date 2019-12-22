package day21;

public class OddPrinter {
    public static void main(String[] args) {

        // count 1 to 10 --> print only odd numbers
        // repeat this 3 times

        for ( int i =1; i <= 3; i++){
            System.out.println("Iteration : " + i);

            for ( int x =1; x <= 10; x++){

                if ( x %2 ==1 ){
                    System.out.println(x + " is odd number");
                }
            }

        }





    }
}
