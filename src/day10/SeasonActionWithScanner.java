package day10;

import java.util.Scanner;

public class SeasonActionWithScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("hey what is the season!!!? ");
        String season = scan.next();

        switch ( season ){
            case "Spring" :
                System.out.println("Hike!");
                break;

            case "Summer" :
                System.out.println("Swim!");
                break;
            case "Fall" :
                System.out.println("Shopping!");
                break;
            case "Winter" :
                System.out.println("Ski!");
                break;
            default:
                System.out.println("Unknown season, Try again!");
                break;
        }

    }
}
