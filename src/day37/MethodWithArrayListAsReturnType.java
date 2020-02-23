package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListAsReturnType {
    public static void main(String[] args) {


        System.out.println(getListFrom1toFinalNumber(7) );
        System.out.println(getListFrom1toFinalNumber(2) );
        System.out.println(getListFrom1toFinalNumber(20) );

        List<Integer> myList = getListFrom1toFinalNumber(25);
        System.out.println("myList = " + myList);



    }
    public static List<Integer> getListFrom1toFinalNumber ( int finalNumber ) {

        List<Integer> nums = new ArrayList<>();

        for (int numbers = 0; numbers <= finalNumber; numbers ++) {

            nums.add(numbers);
        }
       // System.out.println("nums = " + nums);
        return nums;
    }




}
