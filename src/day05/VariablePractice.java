package day05;

public class VariablePractice {

    public static void main(String[] args) {

        /* 8 primitive
        whole numbers       : byte , short , int , long
        fractional numbers  : float, double
        logical             : boolean
        character           : char

        is string part of Primitive types? no
        String is sequence of character

        usually by default for whole numbers        : just use int
        usually by default for fractional numbers   : just use double
        */

        int birthYear = 1985;
        int currentYear = 2019;
        int age = currentYear - birthYear ;
        System.out.println(" I was born in year " + birthYear + " , and I am " + age + " years old");
        // i was born in year 2001 , and I am 34 years old ;
        //System.out.println("I was born in year " + 1985 + ", and I am " + (2019-1985) + "years old");

        int speedLimit = 65;
        int drivingSpeed = 75;
        int speed = speedLimit - drivingSpeed ;
        System.out.println(" Speed limit was " + speedLimit + " My over speed was " + speed + " mile ");


    }
}
