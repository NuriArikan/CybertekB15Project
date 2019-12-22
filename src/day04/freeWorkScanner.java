package day04;

import java.util.Scanner;

public class freeWorkScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println(" Enter your age : " );
        int age = scan.nextInt();
        System.out.println(" You have entered " + age);

        System.out.println("Enter your city ; " );
        String city = scan.next();
        System.out.println("You have entered your city " + city);

        System.out.println("Coding is fun ; "  );
        String easy = scan.next();
        System.out.println("Coding is fun " + easy);

        System.out.println("Your plate number : " );
        int plate = scan.nextInt();
        System.out.println("Your plate number is " + plate );

        System.out.println("IPad Pro price is : " );
        Double price = scan.nextDouble();
        System.out.println("IPad Pro price is : " + price );









    }


}
