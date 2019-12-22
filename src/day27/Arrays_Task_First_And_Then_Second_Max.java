package day27;

public class Arrays_Task_First_And_Then_Second_Max {
    public static void main(String[] args) {

        int [] nums = {100, 10000, 9999, 8888, 1231, 2345};

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {


            if ( nums[i]>max){
                max = nums[i];
            }

        }
        System.out.println("First max number is: " + max);

        int maxSecond = nums[0];

        for (int i = 0; i < nums.length; i++) {


            if (nums[i] > maxSecond && nums[i] != max) {
                maxSecond = nums[i];
            }

        }
        System.out.println("Second max number is: " + maxSecond);






    }
}
