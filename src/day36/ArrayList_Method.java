package day36;

import java.util.ArrayList;

public class ArrayList_Method {
    public static void main(String[] args) {

    // create a ArrayList object of long and assign it to a variable

        ArrayList<Long> lst = new ArrayList<>();

        lst.add(12L) ; // 12L is automatically converted to new Long (12L); because ArrayList only store object
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);

        System.out.println("lst = " + lst);

        // Counting items inside arraylist
        System.out.println("Counting items using lst.size() = " + lst.size() );

        // Getting items inside ArrayList object
        System.out.println("First item is: lst.get(0) = " + lst.get(0));

        // get the sum of above arraylist item
        long sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += lst.get(i);
        }
        System.out.println("SUm is with using for loop is " + sum);


        // MAX
        long max = lst.get(0);
        for (int x = 0; x < lst.size(); x++) {

            if ( lst.get(x) > max) {
                max = lst.get(x);
            }
        }
        System.out.println("max = " + max);

    }




}
