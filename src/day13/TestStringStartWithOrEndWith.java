package day13;

public class TestStringStartWithOrEndWith {
    public static void main(String[] args) {

        String name = "Muge";

        //check if a String start with another string
        // it is case sensitive
        System.out.println( name.startsWith("Mu"));
        System.out.println( name.startsWith("mu"));

        System.out.println( name.startsWith("Mac"));

        // check if a String end with another String
        System.out.println( name.endsWith("ge"));
        System.out.println( name.endsWith("e"));
        System.out.println( name.endsWith("uge"));






    }
}
