package day20;

public class ReversingAString {
    public static void main(String[] args) {
        // given  a string variable name with value
        // reverse this name and store reversed value into
        // another String variable reversedName
                    //
        String name = "Jon Snow";
        String reversedName = "";

        System.out.print( name.charAt(7));
        System.out.print( name.charAt(6));
        System.out.print( name.charAt(5));
        System.out.print( name.charAt(4));
        System.out.print( name.charAt(3));
        System.out.print( name.charAt(2));
        System.out.print( name.charAt(1));
        System.out.print( name.charAt(0));

        System.out.println();

        for (int x = 7; x >= 0 ; x--) {

            System.out.print(x + " index : ");

            char currentChar = name.charAt(x);
            System.out.println( currentChar );

            reversedName = reversedName + currentChar ;

        }
        System.out.println("reversedName = " + reversedName);






    }
}
