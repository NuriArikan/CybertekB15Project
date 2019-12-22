package day07;

import java.util.Scanner;

public class ChildTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //int score = 59;

        // System.out.println(score > 60);

        System.out.println(" Enter your score, please");

        int score = scan.nextInt();

        if (score > 60) {
            System.out.println(" Chocolate for you !!");

            System.out.println(" Enter your score, please");

            int num1 = scan.nextInt();
        } else {

        System.out.println(" Try harder next time ! no tv ant more ! ");

        }

         System.out.println(" The End ");
    }

}