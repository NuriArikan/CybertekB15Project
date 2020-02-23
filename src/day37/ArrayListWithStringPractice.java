package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithStringPractice {
    public static void main(String[] args) {

        List<String> superHeros = new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Wonder Women");
        superHeros.add("Cyborg");
        superHeros.add("Aquaman");
        superHeros.add("Flash");

        System.out.println("superHeros = " + superHeros);

        System.out.println("superHeros.contains(\"Superman\") = " + superHeros.contains("Superman"));


        // remove any heros that doesnot have man in the String
        for (int x = 0; x < superHeros.size(); x++) {

            String currentHero = superHeros.get(x) ;
            if ( !currentHero.contains("man")){
                superHeros.remove( currentHero );
                --x;
            }
        }
        System.out.println("superHeros = " + superHeros);

    }
}
