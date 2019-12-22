package day06;

import java.util.Scanner;

public class WakeUpTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Whats regular price ? ");
        double regularPrice = scan.nextDouble();

        System.out.println("Whats discount percentage ? ");
        double discountPercentage = scan.nextDouble();


        double salePrice = (regularPrice - (regularPrice * discountPercentage));

        System.out.println( "Sale Price is" + salePrice );











    }
}
