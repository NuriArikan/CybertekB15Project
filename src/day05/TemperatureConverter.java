package day05;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("What is the temperature ? ");

        double fahrenheit = scan.nextDouble();
        double celsius = (5/9.0)*(fahrenheit-32);

        System.out.println(" Fahrenheit " + fahrenheit + " is " + celsius );






    }
}
