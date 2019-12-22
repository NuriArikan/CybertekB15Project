package day25;

import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {

        String myName = "NURI";

        char [] myNamesChars = myName.toCharArray();

        // loop over loop
        for ( char eachChar : myNamesChars){

            System.out.println("eachChar = " + eachChar);
        }
        // now count how many we have

        int count =0;

        for (char eachChar : myNamesChars) {

            if (eachChar=='u'){
                ++count;
            }
        }
        System.out.println("count = " + count);

        // sort all characters of your name
        // in alphabetical order ?
        Arrays.sort(myNamesChars);
        System.out.println(Arrays.toString(myNamesChars));




  //      char [] myNamesChars = myName.toCharArray();
  //      System.out.println("My name Char = " + Arrays.toString(myNamesChars));

 //       int charCount = myNamesChars.length;
 //       System.out.println(charCount);








    }
}
