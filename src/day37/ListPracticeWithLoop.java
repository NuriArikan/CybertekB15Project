package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {
    public static void main(String[] args) {

        /*
        create an ArrayList of Integer and fill it up with 1-100
         */

        List<Integer> nums = new ArrayList<>();

        for (int number = 1; number <= 100 ; number++) {

     //       System.out.println("i = " + i);
              nums.add(number);

        }
        System.out.println("nums = " + nums);

    // change all the odd number value to 0 ;

        for (int i = 0; i < nums.size() ; i+=2) {

    //        System.out.println("odd values are at index  = " + i);
            nums.set(i,0);
        }
        System.out.println("nums = " + nums);

        // How to find index of value 20:
        System.out.println("nums.indexOf(20) = " + nums.indexOf(20));


        // insert 100 to first index
        nums.add(0,100);
        System.out.println("nums = " + nums);

        System.out.println("index of 20 after inserting 100 at index 0 = " + nums.indexOf(20));








    }
}
