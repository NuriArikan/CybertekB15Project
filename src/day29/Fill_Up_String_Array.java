package day29;

import java.util.Arrays;

public class Fill_Up_String_Array {
    public static void main(String[] args) {

        // create an array with size 300 and fill it up with I love Java

        String[] strArr = new  String[300];

        strArr [0] = "I Love Java";
        strArr [1] = "I Love Java";
        strArr [2] = "I Love Java";
        strArr [3] = "I Love Java";

        for (int i = 1; i < strArr.length; i++) {

            strArr[i]= (i+1) + " .I Love Java";
        }
        // restaurant repl
        System.out.println("strArr = " + Arrays.toString(strArr) );

        String str = new String("ABC"); // this is string object with value ABC
        String [] strArr2 = new  String[5]; // empty string array with capacity 5 ,

        strArr2 [0] = "I Love Java";
        strArr2 [1] = "I Love Java";
        //....
















    }
}
