package MyFolder;
import java.util.Arrays;
import java.util.Scanner;
public class Repl {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below
        for (int i = 0; i <=nums.length-1 ; i++) {
            int counter=0;
            for (int j = 0; j <=nums.length-1 ; j++) {
                if(nums[i]==nums[j]){
                    counter++;
                }
            }
            if(counter==1){
                System.out.println(nums[i]);

            }
        }







    }

}



