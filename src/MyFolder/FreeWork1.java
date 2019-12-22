package MyFolder;

import java.util.Arrays;

public class FreeWork1 {
    public static void main(String[] args) {

        double [] prices = { 10.90, 13.40, 29.90, 10.10};
        System.out.println(Arrays.toString(prices));
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
        System.out.println("-----");
        String [] superHeros = {"Superman", "Batman", "Wonder Women", "Aquaman", "Cyborg", "Flash", "100", "9", "09"};
        System.out.println(Arrays.toString(superHeros));
        System.out.println("Before sorting String --> " + Arrays.toString(superHeros));
        Arrays.sort(superHeros);
        System.out.println("After sorting String --> " +Arrays.toString(superHeros));
        System.out.println("-----");

        int [] scores1 = {2,5,6,7,3,34,6};
        int [] scores2 = {22,45,6,37,3,6,9};
        int [] scores3 = {2,5,6,7,3,34,6};
        int [] scores4 = {5,2,7,6,3,6,34};

        System.out.println(scores1==scores3);
        System.out.println(scores2==scores3);
        System.out.println("-----");

        boolean s1s3 = Arrays.equals(scores1,scores3);
        System.out.println(s1s3);

        boolean s2s3 = Arrays.equals(scores2,scores3);
        System.out.println(s2s3);


    }
}
