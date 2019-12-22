package day24;

import java.util.Arrays;

public class ArraysMethodSorting {
    public static void main(String[] args) {

        int [] scores = {99,44,66,23,19,55} ;

        System.out.println(Arrays.toString(scores));
        System.out.println("first item value : " + scores[0]);

        // low to high
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        // array is mutable, you cannot change the value
        // the original index of items has changed

        // first item value
        System.out.println("first item value : " + scores[0]);

        System.out.println("-----------character sorting--- ");
        // low to high --> by it is ascii table value
        // special characters comes first, number, uppercase then lowercase

        char[] nameChars = {'G', ' ', 'd', 'Z', '9', 'A'};

        System.out.println(Arrays.toString(nameChars));

        Arrays.sort(nameChars);
        System.out.println(Arrays.toString(nameChars));

        System.out.println("---------String sorting----------");

        String [] superHeros = {"Superman", "Batman", "Wonder Women", " Aquaman", "Cyborg", "Flash", "100", "9", "09"};
        System.out.println(Arrays.toString(superHeros));
        System.out.println("before sorting superHeros = " + Arrays.toString(superHeros));

        Arrays.sort(superHeros);
        System.out.println("after sorting superHeros = " + Arrays.toString(superHeros) );


        System.out.println("----------boolean sorting-----Sort method does not work for boolean array---");

        boolean[] fiveSwitchOnOffs = { true, false, false, true, true};
        System.out.println("fiveSwitchOnOffs = " + Arrays.toString(fiveSwitchOnOffs));

        // Arrays.sort(arrObject) does not return a value that we can store
        // it only takes action to reshuffle the index of original array object to keep it in sort
















    }
}
