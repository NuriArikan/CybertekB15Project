package day33;

import java.util.Scanner;

public class ReturnWillTerminateTheMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number more than 10");

        int num = scan.nextInt();
        if ( num < 10 ){
            // you can use return Keyword to get out of the method
            // in void methods , as long ass you dont actually return a value
            return;
        }

        System.out.println("Happy Holidays");
        System.out.println("2 Days Off!! Yay");


















    }
}
