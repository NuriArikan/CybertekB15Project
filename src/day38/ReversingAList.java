package day38;

import java.util.*;
import java.util.concurrent.Callable;

public class ReversingAList {
    public static void main(String[] args) {


        // reversing an arrayList object

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(200,100,700,400,500) ) ;
        System.out.println("nums1 = " + nums1);

        // after reversing
        Collections.reverse(nums1);
        System.out.println("nums1 after reversing = " + nums1);

        // after sorting in reverse order
        Collections.sort(nums1, Collections.reverseOrder());
        System.out.println("nums1 after sorting reverse order = " + nums1);










    }
}
