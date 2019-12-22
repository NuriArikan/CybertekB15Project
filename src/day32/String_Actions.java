package day32;

public class String_Actions {
    public static void main(String[] args) {

   //     reversePrintMyOwnName();
   //     String name = "Nuri";

        printStringWithDashInBetween("Arya");
        printStringWithDashInBetween("Tokun");
        printStringWithDashInBetween("Lisa");
        printStringWithDashInBetween("Gulbara");

    }
    // printStringWithDashInBetween
    // it has one String parameter called name
    // print each and every character of a string with dash between
    // exculuding the last one Akbar --> N-u-r-i
    // logic : keep concatenating - after each character
    // when it comes to last character dont add it
    public static void printStringWithDashInBetween (String name ){

        for (int i = 0; i <name.length() ; i++) {
            System.out.print(name.charAt(i)  );
            // if I am not at last index then I print -

            if ( i != name.length()-1 ){
                System.out.print("-");
            }
        }
        System.out.println();

    }

    // reversePrintMyOwnName
    public static void reversePrintMyOwnName (  ){

        String name = "Nuri";
        // start from last character and print toward first character
        for (int i = name.length()-1 ; i>=0 ;  i--) {
            System.out.print( name.charAt(i) );
        }
        System.out.println();
    }









}
