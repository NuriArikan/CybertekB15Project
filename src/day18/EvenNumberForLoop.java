package day18;

public class EvenNumberForLoop {
    public static void main(String[] args) {


        for ( int x = 0; x<100; x += 2 ){

            System.out.println(x + " is even number ");
        }

        for ( int x = 0; x<100; x += 3 ){

            System.out.print(x + " is odd number ");
        }

        // fori
        for (int i = 0; i < 100 ; i++) {

            if ( i %2 == 0){
                System.out.println(i + " ");
            }

            System.out.println("End");

            for (int e = 0; e < 100; i++) {

                if ( e %5 == 0 && e %3 == 0){
                    System.out.println(e + " is Fizz Buzz Number ");
                    break;
                }

            }



        }



    }

}
