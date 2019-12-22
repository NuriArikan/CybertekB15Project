package day12;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your season please !!");
        String season = scan.nextLine();

        if ( season.equalsIgnoreCase("Spring") ){
            System.out.println("Hiking!");
        } else if ( season.equalsIgnoreCase( "Summer")){
            System.out.println("Swimming");
        } else if ( season.equalsIgnoreCase("Fall")) {
            System.out.println("Shopping");
        } else if ( season.equalsIgnoreCase("Winter")) {
            System.out.println("Skiing");
        } else {
            System.out.println("Invalid Information!");
        }


    }
}
