package day30;

import java.util.Arrays;

public class SplitAndDefineTheSize {
    public static void main(String[] args) {

        // split method has two version:
        // first split by some separator and get whatever the count of item we get from the result

        // second version : accept 2 external data ,
        // one is the separator another is the limit of your array size
        // so if you have 5 word in asentence if you split by space and put the limit for 2
        // then you will get an array with size 2 --> {first word, the rest of the sentence


        String sentence = "I love Java Java Java" ;

         String[] wordsArray1 = sentence.split(" ") ;
         String [] wordsArray2= sentence.split(" ",2);
         String [] wordsArray3= sentence.split(" ",3);
         String [] wordsArray4= sentence.split(" ",4);
         String [] wordsArray5= sentence.split(" ",7); // ignoring 7 because of limit


        System.out.println("wordsArray1 = " + Arrays.toString(wordsArray1) );
        System.out.println("wordsArray2 = " + Arrays.toString(wordsArray2));
        System.out.println("wordsArray3 = " + Arrays.toString(wordsArray3));
        System.out.println("wordsArray4 = " + Arrays.toString(wordsArray4));
        System.out.println("wordsArray5 = " + Arrays.toString(wordsArray5));

        //   System.out.println("wordsArray = " + Arrays.toString(wordsArray));
        //   System.out.println("wordsArray = " + wordsArray.length);


















    }
}
