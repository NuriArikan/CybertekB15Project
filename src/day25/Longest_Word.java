package day25;

import java.util.Arrays;

public class Longest_Word {
    public static void main(String[] args) {

        String sentence = "We are trying to find longest word";

        String [] allWords = sentence.split(" ");
        System.out.println("allWords = " + Arrays.toString(allWords));

        // first create a string variable longestWord to sotre my result
        // also create macCharCount variable to store my longest char count
        // I want to go through each and every word in string array
        // and check whether the length of current word is more than longestWord
        // if it is I will assign the longest word value to current word I am looking at

        String longestWord = allWords[0];
        int maxCharCount = 0 ;

        for ( String cuurentWord : allWords){

            if ( cuurentWord.length() > longestWord.length() ){
                longestWord = cuurentWord;
            }
        }
        System.out.println("longestWord = " + longestWord);










    }
}
