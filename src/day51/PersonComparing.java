package day51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparing {
    public static void main(String[] args) {

        Person p1 = new Person("Nuri",34);

        Person p2 = new Person("Arafat",25);

        Person p3 = new Person("Asena",18);

//        System.out.println(p1);
//        System.out.println(p2);
//
//        System.out.println(p1.compareTo(p2));

        List<Person> lst = new ArrayList<>();
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);
        lst.add(new Person("John",30));
        System.out.println("lst = " + lst);

        // anything we sort must be a type of comparable
        Collections.sort(lst);
        System.out.println("lst = " + lst);

        // compare p1 and p2 by age
        // if p1 is older print 1
        // if they are same age print 0
        // if p2 is older print -1

//        if ( p1.age > p2.age){
//            System.out.println(p1);
//        } else if ( p2.age > p1.age){
//            System.out.println(-1);
//        }else {
//            System.out.println(0);
//        }




    }

}
