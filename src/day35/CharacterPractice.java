package day35;

public class CharacterPractice {
    public static void main(String[] args) {

        // character class has lots of static method
        // to perform actions on char values
        // isDigit , isLetter , isLetterOrDigit , isUpperCase , isLowerCase
        // toUpperCase , toLowerCase

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));

        String str = "A34B123C4X";
        // get the number out of this String
        // and store it into Integer variable num ;

        String numInStr = "" ;
        for (int x = 0; x < str.length(); x++) {

            // isDigit accept char // each char
            if ( Character.isDigit(str.charAt(x))){
                System.out.println("str.charAt("+x+") = " + str.charAt(x));
                numInStr += str.charAt(x);
            }

        }
        System.out.println("numInStr = " + numInStr);
        Integer num = Integer.valueOf(numInStr);
        System.out.println("num = " + num);















    }
}
