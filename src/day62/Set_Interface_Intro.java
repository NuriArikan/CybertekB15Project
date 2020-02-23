package day62;

import java.util.HashSet;
import java.util.Set;

public class Set_Interface_Intro {
    public static void main(String[] args) {

        // set is a data structure to store unique elements
        // HashSet implements Set interface and always default choice


        Set<Integer> myNums = new HashSet<>();
        myNums.add(10);
        myNums.add(10);
        myNums.add(22);
        myNums.add(13);
        myNums.add(13);
        myNums.add(13);
        myNums.add(30);
        myNums.add(30);

        // it does not keep insertion order
        // it does not have index
        System.out.println("myNums = " + myNums);












    }
}
