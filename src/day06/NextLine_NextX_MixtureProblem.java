package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name ?");
        String name = scan.nextLine();
        System.out.println("Your name is " + name );

        System.out.println("What is your age ?");
        int age = scan.nextInt();
        scan.nextLine();
        // This fixed enter situation.
        System.out.println("Your age is " + age );

        System.out.println("What is address for this street ?");
        String address = scan.nextLine();
        // after age-34, when you entered, it takes both sides, so it doesnt ask for address.
        System.out.println("Address is: " + address);
        // after age-34, if you use space and when you write address, it works in same way as scanner.





    }
}
