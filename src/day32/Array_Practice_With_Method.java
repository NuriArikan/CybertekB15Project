package day32;

import java.util.Arrays;

public class Array_Practice_With_Method {
    public static void main(String[] args) {

        // this is passing the array object directly into the method
       printArrayItems(new  int [] {1,6,5,3,12,3});

        // this is assigning the array object into a variable
        // and then pass it into the method
        int [] scores = {2,5,8,23,4,5,6};
        printArrayItems( scores );

        printMaxOfIntArray(new int [] {1,2,3,4,5,6});
        printMaxOfIntArray(scores);

        printSumOfIntArray(scores);

        compare2arraySize(new String[]{"Hassan","Senay","Astrit"} , new String[]{"Wonder Women","Cyrbog"});
        String[] names1 = {"Superman","Batman","Flash"};
        String[] names2 = {"Wonder Women","Cyrbog"};
        compare2arraySize(names1,names2);

    }
    public static void printArrayItems ( int[] nums  ){

        System.out.println("arrays has items : " + Arrays.toString(nums));

    }
    // printMaxOfIntArray
    // this method has one int array as parameter
    // and it will print the max number inside the array

    public static void printMaxOfIntArray ( int [] arr ){

        int max = arr[0];
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if ( arr[i]<min ) {
                min = arr[i];
            }

        }
        System.out.println("Max item in the array is: "+ max);
        System.out.println("Min item in the array is: " + min);
    }
    public static void printSumOfIntArray ( int [] arr ){

        int sum = 0 ;
        for ( int each : arr ){
            sum = sum + each;
        }
        System.out.println("Sum is " + sum);
    }
    // compare2arraySize
    public static void compare2arraySize ( String [] arr1 , String [] arr2) {

        if (arr1.length > arr2.length) {

            System.out.println("Arr1 has more item ");

        } else if (arr1.length < arr2.length) {

            System.out.println("Arr2 has more item ");
        } else {
            System.out.println("They have same item count ");
        }


    }

}






