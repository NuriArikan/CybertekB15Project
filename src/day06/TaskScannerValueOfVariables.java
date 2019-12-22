package day06;

import java.util.Scanner;

public class TaskScannerValueOfVariables {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your order ? I want to same! ");
        String yourorder = scan.nextLine();
        String yourOrder = "Airpods";
        String myOrder = yourOrder;

        System.out.println("Your order is " + yourOrder +  "\n" + "My order is " + myOrder);



    }
}
