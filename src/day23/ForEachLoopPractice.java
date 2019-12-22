package day23;

import java.util.Arrays;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        long [] salaries = { 100000L , 110000L , 120000L , 130000L , 140000L  };

        System.out.println(Arrays.toString(salaries));

        long myOffer = salaries[0];

        for (int x = 0; x < salaries.length; x++) {
            if(salaries[x]>myOffer){
                myOffer = salaries[x];
            }
        }
        System.out.println("My dream offer is " + myOffer);


        for ( long salary : salaries ){

            if( salary > 1000000){
                System.out.println("salary = " + salary);
            }
        }



        for (long offers : salaries ){

            System.out.println("offers = " + offers);

        }

        long sum =0;

        for (int y = 0; y < salaries.length ; y++) {

            long currentSalary = salaries[y];
            sum = sum + currentSalary;

        }
        System.out.println("sum = " + sum);

        long maxSalary = salaries[0];

        for (long salary : salaries) {
            if (salary>maxSalary){
                maxSalary = salary;
            }
        }
        System.out.println("maxSalary = " + maxSalary);










    }
}
