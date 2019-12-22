package day27;

public class Task2_Finding_Min_And_Larger {
    public static void main(String[] args) {

        // Task 01;
        // write a program that can find the minimum number
        // Do not use sort method
        int [] scores = {100, 897, 654, 32, 1231, 224,556, 7,1,2,3,4};

        int min = 999999999;
        // int min = scores [0];

        for( int i =0; i<scores.length; i++){

            if (min> scores[i]){
                min = scores[i];
            }
        }
        System.out.println("Min number is: " + min);

        // Task 02;
        // write a program that can find the 2. minimum number
        // Do not use sort method

        int secondMin = scores[0];

        for (int x = 0; x < scores.length; x++) {

            if ( scores[x] == min){
                continue;

            }

            if ( secondMin > scores[x]){
                secondMin = scores[x];
            }

        }
        System.out.println("Second minumum number is: " + secondMin);

        // Task 03;
        // write a program that can find the 3. minimum number
        // Do not use sort method

        int thirdMin = scores[0];

        for (int x = 0; x < scores.length; x++) {

            if ( scores[x] == min || scores[x] == secondMin){
                continue;

            }

            if ( thirdMin > scores[x]){
                thirdMin = scores[x];
            }

        }
        System.out.println("Third minumum number is: " + thirdMin);









    }
}
