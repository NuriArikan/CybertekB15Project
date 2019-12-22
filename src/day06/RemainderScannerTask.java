package day06;

import java.util.Scanner;

public class RemainderScannerTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // declare a variable called minutes data type int
        // ask user to enter minutes as whole number
        // print the result in x hour y minutes format
        // for example 135 minutes , 2 hours 15 minutes

        System.out.println("Enter the minute you want to convert ");
        int minutes = scan.nextInt(); // 135; // 60*2+15

        int hourPart = minutes / 60;
        int minsPart = minutes % 60;

        System.out.println("The minutes " + minutes + " is " + hourPart + " hours and " + minsPart + " minutes ");




    }
}
