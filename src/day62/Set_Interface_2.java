package day62;

import java.util.*;

public class Set_Interface_2 {
    public static void main(String[] args) {

        // Creating a HashSet with items already inside

        List<Integer> numList = Arrays.asList(10,10,20,20,20,30,30,30,30);
        System.out.println("numList = " + numList);

        // remember: in HashSet there is no defined order !!
        // your output can be in any order java desire
        Set<Integer> myNums = new HashSet<>( numList );
        System.out.println("myNums = " + myNums);

        // create  a Set of String called states
        // add bunch of states with some duplicate
        // add some duplicate
        // iterate over them

        Set<String> states = new HashSet<>();
        states.add("New York");
        states.add("New York");
        states.add("New Jersey");
        states.add("New Jersey");
        states.add("California");
        states.add("California");
        states.add("California");

        System.out.println("states = " + states);

        // any type of collection has size method to count the item
        System.out.println("How many states ?  = " + states.size());

        // states.forEach(each-> System.out.print(each+" "));

        for ( String each : states){
            System.out.println("Each state = " + each);
        }

        // for loop does not work !! NO INDEX !!

        // we can use Iterator for any type of collection at all time

        Iterator<String> stateIterator= states.iterator();

        while(stateIterator.hasNext()) {

            System.out.println("Iterator each = " + stateIterator.next());
        }

        states.forEach(each-> System.out.println("each = " + each));



    }
}
