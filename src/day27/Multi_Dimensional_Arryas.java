package day27;

import java.util.Arrays;

public class Multi_Dimensional_Arryas {
    public static void main(String[] args) {

        /*
        Single dimensional array: contains values
               int [] arr = { 1, 2, 3};
        Multi-dimensional array: an Array that can contain array(s)
               N dimensional Array contains (N-1) dimensional arrays

            ex: 2 dimensional array : contains 1 dimensional arrays
               int [] [] arr2D = { {1,2,3 } , {4,5,6} }


         */

        int [] arr1D = {1, 2, 3};

        // 2D array : is an array that contains single dimensional arrays
                        // 0  1  2     0  1  2
        int [][] arr2d = {{1, 2, 3} , {4, 5, 6} };
        // index:              0            1
        // [Index Num of 1D Arrays] [Index num of Elements]

        System.out.println(arr2d.length);

        System.out.println(Arrays.toString(arr2d[0]));
        System.out.println(Arrays.toString(arr2d[1]));


        // arr2D [0] [2] ==> 3
        System.out.println(arr2d[0][2]); // returns int value

        // print 5: arr2d [1] [1]
        System.out.println(arr2d[1][1]); // returns int value

        System.out.println(Arrays.toString(arr2d[1]));  // Arrays.to String is only applicable to single dimensional

        // +++++++++++
        // Arrays.deepToString(Multi-D Arrays):
        System.out.println(Arrays.deepToString(arr2d));

        String [][] names = { {} };










    }
}
