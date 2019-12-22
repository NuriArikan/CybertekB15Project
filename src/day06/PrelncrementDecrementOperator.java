package day06;

public class PrelncrementDecrementOperator {

    public static void main(String[] args) {

        //initializing offerCount value to 2
        int offerCount = 2;

        // increasing the number by one normal way
         offerCount = offerCount +1;
        //this is inc the value by one using compound/shorthand operator
         offerCount += 1;

        //Since inc or dec a value is very special
        //and often used in programming
        // There is even shorter shortcut for this operation
        // and we use ++ or -- , THIS IS EXECUSIVLY FOR INCREASING OR DECREASING BY 1
        // WE CANNOT USE IT FOR ANY OTHER TYPE TIME LIKE INC OR DEC VALUE BY MORE THAN ONE.

        ++ offerCount;

        System.out.println("Offer now " + offerCount);

        -- offerCount;

        System.out.println("Offer now " + offerCount);








    }
}
