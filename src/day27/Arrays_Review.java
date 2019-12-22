package day27;

import java.util.Arrays;

public class Arrays_Review {
    public static void main(String[] args) {

        int num =10;
        int [] arr = {10,20,30,40,50,60};

        int num1 = arr[arr.length-1];
        //              6
        System.out.println(num1);

        System.out.println("==========");
        for (int x = 0 ; x<= arr.length-1; x++){

            System.out.println(arr[x] + " ");
        }
        System.out.println("==========");

       String str = Arrays.toString(arr);
       System.out.println(str);









    }
}
