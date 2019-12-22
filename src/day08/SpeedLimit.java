package day08;

public class SpeedLimit {
    public static void main(String[] args) {

        int speedLimit = 60;

        int currentSpeed = 70;

        boolean IamSpeading = ( currentSpeed > speedLimit );

        if ( IamSpeading ){
            System.out.println("Yes, Get pulled over by the police!");
        } else {
            System.out.println("Go shopping!");
        }
        System.out.println("The End");
    }
}
