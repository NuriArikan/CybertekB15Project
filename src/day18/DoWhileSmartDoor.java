package day18;

import java.util.Scanner;

public class DoWhileSmartDoor {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String password;

        do {
            System.out.println("Whats the Password ? ");
            password = scan.next();

        } while ( !password.equals("B15"));

        System.out.println("Door is open!!!!");



    }
}
