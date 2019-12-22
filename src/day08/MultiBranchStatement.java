package day08;

public class MultiBranchStatement {
    public static void main(String[] args) {

        int currentSpeed = 90;
        int speedLimit = 60;

        if ( currentSpeed > 70 ) {
            System.out.println(" You got 2 points");
        }
         else if ( currentSpeed > 60 ){
            System.out.println("You got warning");
        }
        else {
            System.out.println("Keep Driving");
        }

        System.out.println("The End");

    }
}
