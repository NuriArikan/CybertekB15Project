package day37;

import java.util.ArrayList;

public class ArrayList_FindLongest_LoopPractice {
    public static void main(String[] args) {

        ArrayList<String> namelst = new ArrayList<String>();
        namelst.add("Qalbinur");
        namelst.add("Ruzi");
        namelst.add("Sabahiddin");
        namelst.add("Guzelnurin");
        namelst.add("Muyesser");
        namelst.add("Mustafa");

        System.out.println("namelst = " + namelst);

        // find longest name
        String longestName = "";  // namelst.get(0);

        for (int x = 0; x < namelst.size(); x++) {

            String currentName = namelst.get(x);
            // > will give you first longest name if you have more than one
            // >= will give you last longest name if you have more than one
            if (currentName.length() >= longestName.length()) {
                longestName = currentName;
            }

        }
        System.out.println("longestName = " + longestName);


        // how do I get
        for (int i = 0; i < namelst.size(); i++) {

            if (namelst.get(i).length() == longestName.length()) {
                System.out.println("Longest words = " + namelst.get(i));
            }
        }


        // length       : counting the elements inside array, it is a property of array object
        // last item of an array : arr[arr.length-1]
        // length()     : counting the characters inside String, it is a method of String object
        // last char of a String : str.charAt(str.length-1)
        // VS size ()   : counting the elements inside ArrayList object
        // last element of an arrayList : lst.get( lst.size()-1 )

        // how do we use for each loop to go through each items
        for ( String currentName : namelst){

            System.out.println("currentName = " + currentName);
        }


    }
}
