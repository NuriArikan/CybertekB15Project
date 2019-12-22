package day08;

import java.util.Scanner;

public class JustIfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Whats your current speed , dear driver :");
        int currentSpeed = scan.nextInt();


        System.out.println("What is speed limit ");
        int speedLimit = scan.nextInt();

        if ( currentSpeed >= speedLimit) {
            System.out.println("Get pulled over by Police");
        }

        System.out.println("The End");






    }
}
