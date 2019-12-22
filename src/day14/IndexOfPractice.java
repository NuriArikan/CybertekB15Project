package day14;

public class IndexOfPractice {
    public static void main(String[] args) {

        // indexOf
        // find out index of another String inside This String

        String name = "Game of Java"; // length is 12, last char index 11
        // Find out location of Java
        System.out.println(name.indexOf("Java"));

        // find out the location of letter o
        System.out.println(name.indexOf("o"));

        // find out the location of first space
        System.out.println(name.indexOf(" ")); // it gives you first space

        // find out the location of uppercase 0
        System.out.println(name.indexOf("O")); // -1 not exist

        // letter a
        System.out.println(name.indexOf("a"));


    }
}
