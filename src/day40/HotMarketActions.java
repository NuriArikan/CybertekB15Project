package day40;

import java.util.ArrayList;
import java.util.Arrays;

public class HotMarketActions {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.company = "Apple";
        offer1.location = "Austin";
        offer1.isFullTime = true ;
        offer1.salary = 140000;
        offer1.displayInformation();

        Offer offer2 = new Offer();
        offer2.company = "Google";
        offer2.location = "Boston";
        offer2.isFullTime = true ;
        offer2.salary = 100000;
        offer2.displayInformation();

        Offer offer3 = new Offer();
        offer3.displayInformation();

        ArrayList<Offer> myOffers = new ArrayList<>();
        myOffers.add( offer1 );
        myOffers.add( offer2 );
        myOffers.add( offer3 );

        System.out.println("myOffers ====== ");

        for ( Offer each : myOffers ){

            each.displayInformation();

        }
        System.out.println("myOffers =====for loop=====");

        for ( int x = 0 ; x < myOffers.size(); x++) {

            // store each item to a variable each
            Offer each = myOffers.get(x) ;
            each.displayInformation();

            //this is the one shot version
            // myOffers.get(x).displayInformation();


        }















    }
}
