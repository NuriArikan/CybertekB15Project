package day36;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Intro {
    public static void main(String[] args) {

        // How do we create a ArrayList Object

        ArrayList<String> lst1 = new ArrayList<>();
        // it will only store object!!! not primitive
        // ArrayList<int> lst2 = new ArrayList<int>();

        // Correct way to create arraylist object that store whole number
        // is to use Wrapper class type . Primitive type is Forbidden!!!

        ArrayList<Integer> lst2 = new ArrayList<>();

        ArrayList<Long> lst3 = new ArrayList<>();

        ArrayList<Double> lst4 = new ArrayList<>();

        // Optionally you can create in this way

        // List is a more general data type compared to ArrayList is more concrete type
        // ArrayList is one type of list
        // Just like Dog is one type of Animal
        List<String> myLst = new ArrayList<>();


    }
}
