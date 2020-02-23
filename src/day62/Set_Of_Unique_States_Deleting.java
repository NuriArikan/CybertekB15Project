package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Of_Unique_States_Deleting {
    public static void main(String[] args) {

        Set<String> states = new HashSet<>();

        states.addAll((Arrays.asList("GA","NY","FL","CA","NY","WA","VA","VA","FL")));
        System.out.println("states before = " + states);
//        states.remove("FL");
//        System.out.println("states after = " + states);

        states.removeIf(each->each.contains("A")); // VERY NICE !!


        // remove all the states with letter A
        Iterator<String> stIter = states.iterator();

        // iterator has 3 methods hasNext() remove() next() works together
        while ( stIter.hasNext() ){

            String each = stIter.next();
            if ( each.contains("A") ){
                System.out.println("removing each = " + each);
                stIter.remove();
            }
        }
        System.out.println("states after = " + states);


        states.removeIf(each->each.contains("A"));

        System.out.println("stIter.hasNext() = " + stIter.hasNext());

        // if you try to get the next item that you do not have using iterator
        System.out.println("stIter.next() = " + stIter.next());

    }
}
