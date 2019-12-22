package day26;

import java.util.Arrays;

public class Array_Task_Number_Test {
    public static void main(String[] args) {

        // given an int array
        // write a program to test all the element in this int array are more that 100

        int [] scores = {156,101,76,187,87,110};

        System.out.println(Arrays.toString(scores));


        // create a variable called final result to store your result of checking
        // if every number in this array is more than 100 or not

        String finalresult = ""; // if all numbers ara more than 100 then make it yes, if not make it no

        int size = scores.length;
        System.out.println("size = " + size);

        int cntMoreThan100 = 0 ;

        for ( int eachNum : scores) {

            if (eachNum > 100) {
                ++cntMoreThan100;
            }
        }
        System.out.println("cntMoreThan100 = " + cntMoreThan100);


        if ( cntMoreThan100 == size ){
            finalresult = "YES";
        } else {
            finalresult = "NO";
        }
        System.out.println("finalResult = " + finalresult);








        }
}
