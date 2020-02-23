package day36;

import java.util.Arrays;

public class MethodPractice2 {
    public static void main(String[] args) {

        long [] myLongs = { 6L, 11L, 44L, 32L, 65L};
        System.out.println("Before swamp = " + Arrays.toString(myLongs));

        swampFirstAndLastValue(myLongs);
        System.out.println("After swamp = " + Arrays.toString(myLongs));

        Long [] myNums1 = new Long[5] ;
        System.out.println("myNums1 = " + Arrays.toString(myNums1) );

        String [] names = new String [5];
        System.out.println("names = " + Arrays.toString(names) );

        Long [] myNums2 = new Long [5] ;
        System.out.println("myNums2 = " + Arrays.toString(myNums2) );

        int x = 0 ;
        Integer x1 = null ;

        // One thing that primitive variables can not do is :
           // we can not assign it to null
        // Any non - primitive variables
          // Can not assigned to null value
          // to define , it is not pointing to any object yet

    }

    /**
     * Swamp first and last value of long array
     * @param nums long array
     */
    public static void swampFirstAndLastValue ( long [] nums ) {

        // nums[0] , nums [ nums.length-1]
        long temp = nums [0] ;
        nums [0] = nums [ nums.length-1] ;
        nums [ nums.length-1 ] = temp;

    }




}
