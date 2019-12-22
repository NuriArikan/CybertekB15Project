package day03;

public class PrimitivesPractice {

    public static void main(String[] args) {


        byte letterCount = 26 ;
        System.out.println("The letter count is " + letterCount  );

        short sheepCount = 300 ;
        System.out.println("The Sheep count is " + sheepCount );

        int catCount = 20 ;
        System.out.println(" Cat count is " + catCount );

        long mileToSun = 10000000L ;
        System.out.println(" World to Sun mile is " + mileToSun );

        long mileToMoon = 5000000l ;
        System.out.println(" World to Moon mile is " + mileToMoon );


        //-------floating point-------

        // you must add f at he end of number to indicate this is float data type (RULE)

        float priceOfBanana = 1.99f;
        System.out.println(" Banana price is " + priceOfBanana );

        float priceOfPotato = 2.49F;
        System.out.println(" Potato price is " + priceOfPotato);


        // ---larger floating point numbers----

        double priceOfIpad = 355.99d ;
        System.out.println(" IPad price is " + priceOfIpad);

        double priceOfIpadPro = 1024.99D ;
        System.out.println("IPadpro price is " + priceOfIpadPro);


        // complier automatically assume it is a double so it is not required to have d
        // However for good programming habbit , add them always

        double priceOfMac = 2299.99 ;
        System.out.println("Mac price is " + priceOfMac);


        // if you have a whole number by itself, compiler automatically assume it is an int
        // if you have a whole number by itself, compiler automatically assume it is an double




    }

}
