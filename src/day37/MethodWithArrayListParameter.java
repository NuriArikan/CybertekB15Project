package day37;

import java.util.ArrayList;

public class MethodWithArrayListParameter {
    public static void main(String[] args) {

        ArrayList<String> namelst = new ArrayList<String>();
        namelst.add("Qalbinur");
        namelst.add("Ruzi");
        namelst.add("Sabahiddin");
        namelst.add("Guzelnurin");

        printAlist(namelst);

        byte myByte = 17 ;
        printByte(myByte);

        int myInt = 100 ;
        printByte( (byte) myInt);




    }
    public static void printByte (byte b){
        System.out.println("You passed byte value = " + b);
    }




    // Create a method that accept a List of String as argument
    // same thing as a method that has List of String parameter
    // and print out each and every item in the list vertically
    // return nothing
    public static void printAlist (ArrayList<String> lst ){

        for ( String each : lst ){
            System.out.println("each = " + each);
        }

    }





}
