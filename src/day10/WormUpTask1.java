package day10;

public class WormUpTask1 {
    public static void main(String[] args) {

        String myAnswer = "";
        int myNumber = 15;


        if ( myNumber %2 == 0 ) {
            myAnswer ="Fizz Number";
        } else {
            myAnswer = "Not a Fizz Number";
        }
        System.out.println("My number is " +myNumber+", My answer is "+myAnswer);


    }
}
