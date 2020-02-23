package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Bulk_Operation {
    public static void main(String[] args) {


        List<String> groceries = Arrays.asList("Eggs", "Milk", "Butter", "Apple", "Salmon");
        System.out.println("groceries = " + groceries);

        ArrayList<String> newList = new ArrayList<>(groceries);

        newList.add("Diet Coke");
        newList.add("Sugar");
        System.out.println("newList = " + newList);

        // actually I have list of items for you here: Pasta, Branzini ,asparagus , spinach
        List<String> newItemsToAdd = Arrays.asList("Pasta", "Branzini", "asparagus", "spinach");

        // Adding one list to another list
        // we want to add all items inside newItemsToAdd to newLst
        newList.addAll(newItemsToAdd);
        System.out.println("newList = " + newList);




    }
}
