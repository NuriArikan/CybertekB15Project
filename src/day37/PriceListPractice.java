package day37;

import java.util.ArrayList;
import java.util.List;

public class PriceListPractice {
    public static void main(String[] args) {

        List<Double> priceList = new ArrayList<>();

        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);

        System.out.println("priceList = " + priceList);

        // change the third price to $10
        priceList.set(2,10.0);
        System.out.println("third item new price" + priceList.get(2));
        
        // add $4 to first price
        priceList.set(0,priceList.get(0)+4 );
        System.out.println("priceList.get(0) = " + priceList.get(0));


        // change last price to sum of first and second price
        Double sumOfFirst2Items = priceList.get(0) + priceList.get(1);
        priceList.set(priceList.size()-1 , sumOfFirst2Items);
        System.out.println("New priceList = " + priceList);


        // give %40 off the second price
        priceList.set(1,priceList.get(1) * 0.6 );
        System.out.println("After %40 off second item value is " + priceList.get(1) );

        // double the value of each and every price in the list
        // in order to update an item we need an index and new value
         priceList.set(0 , priceList.get(0) * 2 );

        for (int x = 0; x < priceList.size(); x++) {

            double newVal = priceList.get(x)*2 ;
            priceList.set(x,newVal);

        }
        System.out.println("priceList = " + priceList);


        // cut the price into half if the price is more than 20$
        for (int i = 0; i < priceList.size(); i++) {

            double eachPrice = priceList.get(i);

            if ( eachPrice>20) {

                priceList.set(i,eachPrice/2);
            }

        }
        System.out.println("priceList = " + priceList);

        // swap the first value with the last value
        int lastIndex = priceList.size()-1;
        Double temp = priceList.get(0);
        priceList.set(0,priceList.get(lastIndex) ) ;
        priceList.set(lastIndex , temp ) ;

        System.out.println("Price List after swapping first and last value: " + priceList );









    }







}
