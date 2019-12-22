package day24;

import java.util.Arrays;

public class ArraysClassMethod {
    public static void main(String[] args) {

        // Arrays class a class coming from java.util package
        // it has a lot of pre-built method to work with array object

        // for printing the content of the array
        // toString --->>> Arrays.toString(yourArrayHere)

        String [] superHeros = {"Superman", "Batman", "Wonder Women", " Aquaman", "Cyborg", "Flash"};
        System.out.println(Arrays.toString(superHeros));

        // saving the string result into a variable and print
        String superHerosAsString = Arrays.toString(superHeros);
        System.out.println(superHerosAsString);

        // how do we get first character of  superHerosAsString
        System.out.println(superHerosAsString.charAt(0));

        int [] numbers = {10,44,55,3,78};
        System.out.println(Arrays.toString(numbers));



        // for sorting an array in ascending order
        // sort ---> Arrays.sort(yourArrayHere)

        // for checking for equality of 2 array object content
        // equals --> Arrays.equals(firstArray.seconArray)



    }
}
