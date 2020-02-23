package day63;

import java.util.HashMap;
import java.util.Map;

public class FindingCharacterOfCharacters {
    public static void main(String[] args) {

        String str = "AAABBBBBBACCRDDD";

        // get the frequency and store into map <Character, Integer>

        Map<Character,Integer> charFreq = new HashMap<>();

        for (int x = 0; x < str.length() ; x++) {

            char currentChar = str.charAt(x);

            if ( !charFreq.containsKey(str.charAt(x))){

                System.out.println("Enter for first time " +currentChar);
                charFreq.put(str.charAt(x),1);

            } else {
                // if we come to this point it means it has already show up
                // so we update the count with 1 extra than existing count
                charFreq.replace( currentChar, charFreq.get(currentChar)+1 );
            }

        }
        System.out.println("charFreq = " + charFreq);





    }
}
