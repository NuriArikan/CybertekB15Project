package day25;

import java.util.Arrays;

public class String_Split_Method {
    public static void main(String[] args) {

        String sentence = "I Love Java";

        // We get out String array
        String [] allWords = sentence.split(" ");

        System.out.println("all Words = " + Arrays.toString(allWords));
        System.out.println("How many word do I have in this sentence ? : " + allWords.length);

        // How do I get the last word of the sentence using this array i got from string
        System.out.println("Last word in this sentence is " + allWords[allWords.length-1]);

        String sentence2 = "Everything is Awwsome!!!";
        // split by letter e
        String[] splitBy_e_Arr = sentence2.split("e");
        System.out.println("splitBy_e_Arr = " + Arrays.toString(splitBy_e_Arr));

        for ( String eachPieces : splitBy_e_Arr ) {
            System.out.println("eachPieces = <" + eachPieces +">");
        }














    }
}
