package day30;

import java.util.Arrays;

public class Car_Inventory_1000 {
    public static void main(String[] args) {


        String[] cars = {
                "Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic",
                 "Honda-RV",
                "Lexus-IS-F" ,
                 "Lexus-LS",
                 "Lexus-LSX"};

        int chevyCNT = 0 ;
        int civicCNT    = 0 ;

        for (int i = 0; i < cars.length; i++) {

            //   System.out.println(cars[i]);
            if (cars[i].contains("Chevrolet")) {
                chevyCNT++;
            }
            if (cars[i].contains("Civic")) {
                civicCNT++;

            }
        }
        System.out.println("civicCNT = " + civicCNT);
        System.out.println("chevyCNT = " + chevyCNT);

        // Task 2 : Print All Location of Civic in this array
        // Honda-Civic
        for (int x = 0; x < cars.length; x++) {

           // if ( cars[x].contains("Civic")){
            if ( cars[x].equals("Honda-Civic")){
                System.out.println("Civic found at location : " + x);
            }
        }

        // Task 3 : Print Make and Model separately in this format
        // Honda-Civic -->>
             // Car make is Honda and Model is Civic
        // print only Honda brand cars


        String eachChar = "Honda-Civic";
        String[] eachCharSplitted = eachChar.split("-");

        System.out.println("Car make is " + eachCharSplitted[0] +
                            " Car model is " + eachCharSplitted[1] );

        for ( String eachCar : cars) {

            if (eachCar.startsWith("Honda")){

                String[] eachCarSplitted  = eachCar.split("-");

             //   System.out.println("eachCar = " + eachCar);

                System.out.println("Car Make is " + eachCarSplitted[0] +
                                    " Car model is " + eachCarSplitted[1]);

            }
        }

        // find all the car with model has only 2 characters
        // print them out
        // get the count

        int cntOf2CharModel = 0 ;
        for ( String eachCar : cars) {
            String model = eachCharSplitted[1];
            String [] eachCarSplitted = eachChar.split("-",2);

            // model is second item in splitted array ( at index 1 )
            // if ( eachCarSplitted[1].length() == 2 ) {
            if (model.length()==3){
                cntOf2CharModel++ ;

                System.out.println(eachCar);
            }

        }
        System.out.println("Count Of cars with only 2 character in their model = " + cntOf2CharModel);



        String car = "Lexus-LS-F" ;
        String [] carSplitted = car .split("-");
        System.out.println("carSplittted = " + Arrays.toString(carSplitted));


        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));









    }
}
