package day36;
import java.util.ArrayList;
public class ArrayList_Method2 {
    public static void main(String[] args) {

        ArrayList<Long> lst = new ArrayList<>();

        lst.add(12L) ; // 12L is automatically converted to new Long (12L); because ArrayList only store object
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);

        System.out.println("lst = " + lst);
        // I want to insert 125 between 100L and 150L , basically 2nd and 3rd item
        
        lst.add(2,125L);
        System.out.println("lst = " + lst);

        System.out.println("lst.get(3) = " + lst.get(3));

        // updating value at certain index : set method
        lst.set(3,195L);
        System.out.println("New value for lst.get(3) = " + lst.get(3));

        // removing item by its value
        lst.remove(100L);
        System.out.println("lst after removing 100 = " + lst);

        // removing item by it is index
        lst.remove(2);
        System.out.println("lst after moving index 2 = " + lst);


        // looking for location of certain item
        System.out.println("Location of 100L is using lst.indexOf(100L) " + lst.indexOf(200L));
        
        // check whether a list is empty or not
        System.out.println("lst.size()>0 = " + (lst.size()>0));
        System.out.println("lst.isEmpty() = " + lst.isEmpty());

        // how do I delete everything inside my ArrayList
        lst.clear();
        System.out.println("Check after clear lst.isEmpty() = " + lst.isEmpty());






        
    }
}
