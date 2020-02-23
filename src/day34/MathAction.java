package day34;

import day31.Calculater_V2;

import java.util.Arrays;

public class MathAction {
    public static void main(String[] args) {

        int result1 = PracticeMethodWithNumbers.build3DigitNumber(6, 4, 0);
        System.out.println("result1 = " + result1);


        int[] nums = {2, 5, 7};
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums) );

        Calculater_V2.calculater(10,20,'-');


    }
}