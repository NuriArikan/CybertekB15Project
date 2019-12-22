package day29;
import java.util.Arrays;
public class Filling_Up_Array_Value {
    public static void main(String[] args) {

        // create an array with size 100 and fill it up below

        int [] numbers = new int [100];

        System.out.println(Arrays.toString(numbers) );

//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
        for (int x = 0; x < numbers.length; x++) {
            // fill up with 1-100
            numbers[x] = x+1;
        }
        System.out.println(Arrays.toString(numbers));
















    }
}
