package day38;

import java.util.*;

public class SortingAListObject {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(300,200,700,600,800) ) ;
        System.out.println("nums = " + nums);
        // 2 ways to sort an Arraylist
        // Use Collections utility class ( just like Arrays utility class for array objects )

        Collections.sort(nums);
        System.out.println("nums after sort = " + nums);

        // this version of sort method accept 2 arguments
        // 1st is the list to be sorted
        // 2nd a Comparator Object that contains comparing logic
        // good news is there is ready method already in java
        // we can get reserve order comparator object by calling
        // Comparator.reverseOrder() , just take it and use it !

        Collections.sort(nums, Comparator.reverseOrder() );
        System.out.println("nums after 2nd sort = " + nums);

        // list itself also has sort method that accept one Comparator Object
        // simple way to get Comparator objects are
        // Comparator.naturalOrder() --> low to high order
        // Comparator.reverseOrder() --> high to low order

        nums.sort(Comparator.naturalOrder());
        System.out.println("nums low to high = " + nums);

        nums.sort( Comparator.reverseOrder());
        System.out.println("nums high to low = " + nums);







    }
}
