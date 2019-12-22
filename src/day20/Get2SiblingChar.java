package day20;

public class Get2SiblingChar {
    public static void main(String[] args) {
        // given a string with even number character count
        // print 2 characters in one line as below example
        //
        //for example : Arya

        String name = "Arya";
        int charCount = name.length();
        int lastCharIndex = charCount -1 ;

        // my condition is x <= charCount-2

        for ( int x = 0; x<=charCount-2 ; x +=2 ){

            System.out.println(name.substring(x,x+2) );
        }

        // getting 3 character
        /*
        for ( int x = 0; x<=charCount-2 ; x +=2 ){

            System.out.println(name.substring(x,x+3) );
        }

         */






    }
}
