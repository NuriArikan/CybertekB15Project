package day07;

import java.util.Scanner;

public class FreeWorkIfandElseWithScanner {
    public static void main(String[] args) {

        /*
        int score = 61;

        if (score>60) {
            System.out.println("Apple for you");
        } else {
            System.out.println("No fishing");
        }
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your score, please");
        int score = scan.nextInt();

        if (score>60) {
            System.out.println("Apple for you");
        } else {
            System.out.println("No fishing weekends");
        }



    }
}
