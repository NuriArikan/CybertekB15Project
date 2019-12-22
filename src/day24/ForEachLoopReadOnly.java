package day24;

public class ForEachLoopReadOnly {
    public static void main(String[] args) {

        long [] nums = {10, 40, 20};
        // how do i change double my first item in the array

  //      nums[0]= nums[0]*2;  // nums[0] *= 2;
  //      System.out.println(nums[0]);

        for (int x = 0; x < 3; x++) {
            System.out.println(nums[x]*2);
        }

        for (int x = 0; x < 3; x++) {
            System.out.println(nums[x]);
        }

        // *** never use for each loop to modify array items ***





    }
}
