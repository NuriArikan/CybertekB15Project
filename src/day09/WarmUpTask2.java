package day09;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Whats your age?");
        int age = scan.nextInt();

        if( age > 65 ) {
            System.out.println("Citizen Type is is a Senior");
        } else {
            System.out.println("Citizen Type is not a Senior");
        }


    }

}
