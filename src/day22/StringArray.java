package day22;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {

        String [] houseHold = new String[3];

        houseHold[0]= "John";
        houseHold[1]= "Betty";
        houseHold[2]= "Judith";

        System.out.println(houseHold[0] + ", " + houseHold[1] + ", " + houseHold[2]);

        // immutable means you cannot change the internal structure of the object
        // if you have String abc = " hello"
        // if you do abc.toUppercase --> it will create new String object "HELLO"
        // and it does not change original hello at all !!


        // not resizable --> specifically for array
        // we can not change the size of array once we create them with certain size
        // However , we can change the elements inside this array
        // and it means : IT IS NOT IMMUTABLE











    }
}
