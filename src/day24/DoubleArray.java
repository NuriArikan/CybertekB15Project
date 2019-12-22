package day24;

import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {

        double [] prices = {9.99, 19.95, 12.25};
        String priceString = Arrays.toString(prices);
        System.out.println(priceString);
        int length = priceString.length();
        for (int x = 0; x <length ; x++) {
            System.out.println("character at index " + x + ": " + priceString.charAt(x));
        }





    }
}
