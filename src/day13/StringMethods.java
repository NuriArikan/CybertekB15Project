package day13;

public class StringMethods {
    public static void main(String[] args) {

        // String actions that we already know so far

        // equals
        String s1 = "Hello";
        System.out.println(s1.equals("hello"));
        // equalsIgnoreCase
        System.out.println( s1.equalsIgnoreCase("HELLO"));

        // toUpperCase method of string is used to make String all character uppercase
        System.out.println( s1 );
        System.out.println( s1.toUpperCase() );

        // toLoweCase
        System.out.println( s1 );
        System.out.println( s1.toLowerCase() );

        String myName = new String("Nuri");
        String yourName = myName;

        System.out.println(myName.equals(yourName));
        System.out.println("My name is " + yourName);
        System.out.println("Your name is "+ myName);

        System.out.println(myName.toUpperCase());
        System.out.println(myName.toLowerCase());

        // In order to get how many character we have inside String
        // We can use length method of String
        System.out.println( s1.length());

        int lengthsOfStr = s1.length();

        if( lengthsOfStr>4){
            System.out.println("More than 4 character");
        } else {
            System.out.println("Not more than 4 character");
        }



    }
}
