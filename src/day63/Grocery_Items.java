package day63;

import java.util.HashMap;
import java.util.Map;

public class Grocery_Items {
    public static void main(String[] args) {

        Map<String,Double> groceryItems = new HashMap<>();

        groceryItems.put("Tomato",1.99);
        groceryItems.put("Banana",0.99);
        groceryItems.put("Grape",1.01);
        groceryItems.put("Cherry",2.99);
        groceryItems.put("Orange",1.25);
        groceryItems.put("Garlic",0.50);
        groceryItems.put("Berry",1.50);

        System.out.println("groceryItems = " + groceryItems);

        System.out.println(" ==== " );

        System.out.println("groceryItems.size() = " + groceryItems.size());

        System.out.println(" ==== " );

        System.out.println("groceryItems.containsKey(\"Grape\") = " + groceryItems.containsKey("Grape"));

        System.out.println(" ==== " );

        System.out.println("groceryItems.putIfAbsent(\"Cherry\",2.99) = " + groceryItems.putIfAbsent("Cherry", 2.99));

        System.out.println(" ==== " );

        groceryItems.remove("Tomato");
        System.out.println("groceryItems = " + groceryItems);

        System.out.println(" ==== " );

        groceryItems.replace("Garlic",0.50,0.75);
        System.out.println("groceryItems = " + groceryItems);

        System.out.println(" ==== " );

        System.out.println("groceryItems.get(\"Grape\") = " + groceryItems.get("Grape"));

        System.out.println(" ==== " );

        groceryItems.replace("Banana",groceryItems.get("Banana")*2);
        System.out.println("groceryItems.get(\"Banana\") = " + groceryItems.get("Banana"));

        if (groceryItems.containsKey("Tomato")) {
            groceryItems.remove("Tomato");
            System.out.println("NO MORE TOMATO!@");
        }
        System.out.println("groceryPriceMap = " + groceryItems);
















    }
}
