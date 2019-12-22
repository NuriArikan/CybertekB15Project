package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Whats your name ?");

    String name = scan.nextLine();
    // nextLine will capture whole line

    System.out.println("You have entered " + name );





    }
}
