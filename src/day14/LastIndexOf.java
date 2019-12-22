package day14;

public class LastIndexOf {
    public static void main(String[] args) {


        String name = "Game of Java";

        // find out the last letter a shows up
        System.out.println( name.lastIndexOf("a"));

        //find out last location the character space shows up
        System.out.println(name.lastIndexOf(" "));

        //find out last location the letter Ga shows up
        System.out.println(name.lastIndexOf("Ga"));

        //find out last location the letter Kawa shows up
        System.out.println(name.lastIndexOf("Kawa"));

        // if I dont use contains method;

        if ( name.indexOf("Kawa") > -1){
            System.out.println("Kawa found!");
        }else {
            System.out.println("No Kawa!");
        }




    }
}
