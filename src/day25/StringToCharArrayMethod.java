package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {

        String name = "Alesya" ;

        // how would you store each and every character
        // to an char array from above name
        // without using method we are about to learn
        char [] namesChar = new char[name.length()];

    //    namesChar[0] = name.charAt(0);
    //    namesChar[1] = name.charAt(1);

        for ( int x = 0; x < namesChar.length; x++){
            namesChar[x] = name.charAt(x);
        }
        System.out.println("nameChar = " + Arrays.toString(namesChar));

        char [] nameChar2 = name.toCharArray();
        System.out.println("nameChar2 = " + Arrays.toString(nameChar2));

        String myName = "Nuri";

        char [] myNamesChars = myName.toCharArray();
        System.out.println("My name Char = " + Arrays.toString(myNamesChars));












    }
}
