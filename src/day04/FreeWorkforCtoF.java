package day04;

import java.util.Scanner;

public class FreeWorkforCtoF {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        // Ask user to Fahrenheit
        System.out.println("Enter Fahrenheit : " );
        // Capture what user typed on keyboard in console for fahrenheit
        Double fahrenheit = scan.nextDouble();
        // Print the result of what we saved from user input
        Double celsius = (5/9.0)*(fahrenheit-32);
        System.out.println(fahrenheit + "F equals to " + celsius + "C.");




    }
}
