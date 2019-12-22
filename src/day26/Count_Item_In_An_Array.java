package day26;

import java.util.Arrays;

public class Count_Item_In_An_Array {
    public static void main(String[] args) {

        String[] marvelHeroes = {"Iron Man","Captain America","Spider man",
                "Black Panther","Hulk","Black Widow","Wanda","Captain Marvel",
                "Black Panther","Hulk","Black Widow","Captain America","Spider man","Iron Man"};

        System.out.println("marvelHeros = " + Arrays.toString(marvelHeroes) );
        int sizeOfArray = marvelHeroes.length;
        System.out.println("Hero count = " + sizeOfArray);


        String itemToSearch = "Black Widow";
        int countOfItem = 0 ;

        for ( String eachHero : marvelHeroes) {

            if ( eachHero.equals(itemToSearch) ) {
                countOfItem ++;
            }
        }
        System.out.println("countOfItem = " + countOfItem);

        // Count the hero with the name contains black in case insensitive manner
        int countOfBlackInName = 0;

        for ( String eachHero : marvelHeroes) {

            if ( eachHero.toLowerCase().contains("black")){
                countOfBlackInName ++ ;
            }
        }
        System.out.println("countOfBlackInName = " + countOfBlackInName);










    }
}
