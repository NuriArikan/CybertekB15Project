package day30;

import java.util.Arrays;

public class Split_Practice {
    public static void main(String[] args) {


        String car = "Lexus-LS-F" ;
        String [] carSplitted = car .split("-",2);
        System.out.println("carSplittted = " + Arrays.toString(carSplitted));
        System.out.println("car = " + car);

       String model = carSplitted[1]; // very nice
       System.out.println("model = " + model );













    }
}
