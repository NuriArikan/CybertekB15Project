package day27;

import java.util.Arrays;

public class Multi_Dimensional_Array_Practice {
    public static void main(String[] args) {

        // +++++++++++
        // Arrays.deepToString(Multi-D Arrays):

                    //              0           1              0        1
        String [][] names = { {"Rukhshona" , "Ghoya" } ,  {"Hasan" , "Tetiana"} };
                   //                     0                        1

        // print Hasan
        System.out.println(names[1][0]);
        // print Tetiana
        names[1][1] = "Dilshat";
        System.out.println(names[1][1]);

        // print Hasan and Dilshat
        System.out.println(Arrays.toString(names[1]));

        // print entire name
        System.out.println(Arrays.deepToString(names));

        // LOOP
        int [][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
        //                     0       1       2

        System.out.println(Arrays.toString(numbers[0]));

        System.out.println("====");

        for (int i = 0; i < numbers.length ; i++) { // check each index of two dimensional

         //   System.out.println(Arrays.toString(numbers[i]));

            // 1 2 3 ..with space
            for (int x = 0; x < numbers[i].length; x++) { // check each elements of single

                System.out.print(numbers[i][x] + " ");

            }
        }

        System.out.println("====");
        System.out.println("====");

        int [][] ages = {{10},{12,13,14,15,16,17},{19,20,21,22,23}};

        for (int i = 0; i < ages.length; i++) {

            for (int x = 0; x < ages[i].length; x++) {

                if ( ages[i][x]%2 !=0 ){
                    continue;
                }
                System.out.println("Even numbers: " + ages[i][x]);
            }

        }
        System.out.println("====");

        int [] arr1D = {1,2,3};

        for( int each : arr1D){

            System.out.print(each + " ");

        }
        System.out.println("====");
        System.out.println("====");

        int[][] arr2D = { {10,20,30}, {40,50,60,70,80,90,100}};

        for( int[] each1DArray: arr2D ){

            for (int eachElement : each1DArray) {

                System.out.print(eachElement + " ");
            }


        }










    }
}
