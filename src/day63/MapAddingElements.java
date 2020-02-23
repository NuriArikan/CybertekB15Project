package day63;

import java.util.HashMap;
import java.util.Map;

public class MapAddingElements {
    public static void main(String[] args) {

        Map<String,Integer> nameAgePair = new HashMap<>();

        // adding elements : put
        nameAgePair.put("Zehra",6);
        nameAgePair.put("Maiia",27);
        nameAgePair.put("Aidar",20);
        nameAgePair.put("Fatih",27);
        nameAgePair.put("Nuri",34);
        nameAgePair.put("Ruhksona",16);
        // the keys of the map is unique, it does not accept duplicate
        // here since we already have Zehra -> it will just replace the old value with new one
        nameAgePair.put("Zehra",7);

        // how do I only add new items if it does not already exists(java 8 addition)
        nameAgePair.putIfAbsent("Zehra",10);

        System.out.println("nameAgePair = " + nameAgePair);

        // getting the size of a map
        System.out.println("nameAgePair.size() = " + nameAgePair.size());

        // how do we get an value according to the key
        System.out.println("Zehra's age = " + nameAgePair.get("Zehra"));

        // how do i check a key already exist or not
        System.out.println("nameAgePair.containsKey(\"Ruhksona\") = " + nameAgePair.containsKey("Ruhksona"));
        System.out.println("nameAgePair.containsKey(\"Hasan\") = " + nameAgePair.containsKey("Hasan"));


        // updating the element in the map using replace
        nameAgePair.replace("Maiia",17);
        System.out.println("nameAgePair.get(\"Maiia\") = " + nameAgePair.get("Maiia"));

        System.out.println(" ======= "  );
        // why we just dont use put ?? what is the downside
        // if i dont have that key, it will add new one and that's not what we want , we only want to update
        nameAgePair.replace("Maiia",17,20);
        System.out.println("nameAgePair.get(\"Maiia\") = " + nameAgePair.get("Maiia"));
        // update age to 17 to 20

        System.out.println(" ====== " );
        // removing Entry by the key
        nameAgePair.remove("Fatih");
        // try not to use get method to check you have the entry or not
        // because if you dont have the key you will get null
        // but you will also get null if the value was actually null --{Fatih = Null}
        System.out.println("nameAgePair.get(\"Fatih\") = " + nameAgePair.get("Fatih"));
        System.out.println("nameAgePair.containsKey(\"Fatih\") = " + nameAgePair.containsKey("Fatih"));





    }
}
