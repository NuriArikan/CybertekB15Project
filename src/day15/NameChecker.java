package day15;

import java.util.Scanner;

public class NameChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        int lengthName = name.length();
        System.out.println("lengthName = " + lengthName);

        if ( lengthName <4){
            System.out.println("Short Name");
        } else if ( lengthName >= 4 || lengthName <= 10){
            System.out.println("Medium Name");
        } else {
            System.out.println("Long Name");
        }

        if ( name.contains("a") || name.contains("e") ){
            System.out.println("contains 'a' or 'e' ");
        } else {
            System.out.println("Contains both");
        }










    }
}
