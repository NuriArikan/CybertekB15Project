package day06;

import java.util.Scanner;

public class ScannerCapturingOneWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name = scan.next();
        // .next() will keep only first-one word by separated space

        String anotherword = scan.next();

        System.out.println("You have entered " + name);
        System.out.println("Another word is " + anotherword );




    }
}
