package day32;

public class CharacterActions {
    public static void main(String[] args) {

        printAtoZ();
        printZtoA();

        printAtoD();
        printDtoA();

        printAlphabetInRange('a','f');
        printAlphabetInRange('G','B');
    }
    // printAtoZ
    public static void printAtoZ ( ) {

        for (char iChar = 'A'; iChar <= 'Z' ; iChar++) {

            System.out.print(iChar + " ") ;
        }
        System.out.println(); // add an empty line so we can move to next line
    }
    // printZtoA
    public static void printZtoA () {
        // this is how we can print in descending order
        // Z --> Y
        for (char iChar = 'Z'; iChar >= 'A' ; iChar--) {

            System.out.print(iChar + " ") ;
        }
        System.out.println(); // add an empty line so we can move to next line
    }
     // printAtoD
     public static void printAtoD ( ) {

         for (char iChar = 'A'; iChar <= 'D' ; iChar++) {

             System.out.print(iChar + " ") ;
         }
         System.out.println(); // add an empty line so we can move to next line
     }
    // printDtoA
    public static void printDtoA () {
        // this is how we can print in descending order
        // Z --> Y
        for (char iChar = 'D'; iChar >= 'A' ; iChar--) {

            System.out.print(iChar + " ") ;
        }
        System.out.println(); // add an empty line so we can move to next line
    }
     /*
    printAlphabetInRange
    * create a method that have 2 char as parameters: beginning, ending
    if beginning character is before ending character
	for example beginning A , ending D  -->> ABCD
    if beginning character is after ending character
	for example beginning D , ending A  -->> DCBA
	*/
     public static void printAlphabetInRange ( char beginning, char ending ) {

       if (beginning < ending) {
           System.out.println("We need to increment from " + beginning + " till " + ending);

           for (char iChar = beginning; iChar <= ending ; iChar++) {
               System.out.println(iChar + " ");
           }

       } else if (beginning > ending) {
           System.out.println("We need to decrement " + beginning + " till " + ending);

           for (char iChar = beginning; iChar >= ending ; iChar--) {
               System.out.println(iChar + " ");
           }
           System.out.println();

       } else {
           System.out.println("They are same character");

       }

   }




}


