package day05;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" How many minutes a day ? ");
        double day = scan.nextDouble();
        double min = 24 * 60;
        System.out.println(" A day  " + min + "minutes " );


        System.out.println(" What is hourly wage ? ");
        float wage = scan.nextFloat();
        System.out.println(" How many hours he works for a year " );
        int hours = scan.nextInt();
        System.out.println(" His yearly salary is " + (wage * hours ) );


        /*
    Task 5 : Grocery Shopping
    *   ask user whats the price of tomato and store it
        ask user how many tomato you want to buy and store it
    *   ask user whats the price of potato and store it
        ask user how many potato you want to buy and store it
    *   ask user whats the price of banana and store it
        ask user how many banana you want to buy and store it

        generate this example output
        You got 3 tomato price is 2.99 and total -->>
        You got 5 potato price is 3.49 and total -->>
        You got 2 banana price is 1.99 and total -->>

        Your grand total for this shopping is ????
        */

        System.out.println(" What is price for tomato ? ");
        float tomatoPrice = scan.nextFloat();
        System.out.println("How many you want to buy ? ");
        int tomatoCount = scan.nextInt();
        System.out.println(" Your total tomato is " + (tomatoPrice * tomatoCount) );
        float  totalPriceForTomato = tomatoPrice * tomatoCount ;


       System.out.println(" Whats price for potato ? ");
       float potatoPrice = scan.nextFloat();
       System.out.println(" How many you want to buy ? ");
       int potatoCount = scan.nextInt();
       System.out.println(" Your total for potato is " + (potatoPrice * potatoCount) );
       float totalPriceForPotato = potatoPrice * potatoCount ;

       System.out.println(" What is price for banana ? ");
       float bananaPrice = scan.nextFloat();
       System.out.println(" How many you want to buy ? ");
       int bananaCount = scan.nextInt();
       System.out.println("Your total for banana is " + (bananaPrice * bananaCount) );
       float totalPriceForBanana = bananaPrice * bananaCount ;

       System.out.println(" Your grand total for this shopping is " + (totalPriceForTomato+totalPriceForPotato+totalPriceForBanana) + "dollars. "  );




    }
}
