package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {

        int [] nums = {13,31,8,5,21,2};
        int itemCount = nums.length;
        // I want to copy the content of nums array into the new array

        // creating an array with same size as original array
        int[] numsCopy = new int[itemCount];
        numsCopy[0] = nums[0];
        numsCopy[1] = nums[1];
        numsCopy[2] = nums[2];
        numsCopy[3] = nums[3];
        numsCopy[4] = nums[4];
        numsCopy[5] = nums[5];
        System.out.println("numsCopy = " + Arrays.toString(numsCopy));

        for (int x = 0; x < itemCount; x++) {
            numsCopy[x] = nums[x];
        }
        Arrays.sort(numsCopy);
        System.out.println("After sort = " + Arrays.toString(numsCopy));

        if ( Arrays.equals(nums,numsCopy)){
            System.out.println("This array is already sorted");
        } else {
            System.out.println("This array is not already sorted");
        }






        System.out.println("-------");
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println("Nums in oreder = " + Arrays.toString(nums));





    }
}
