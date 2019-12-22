package day21;

public class SearchingInString {
    public static void main(String[] args) {
                    // 01234567890
        String name = "Nuri Arikan";

        int charCount = name.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount -1 ;
        System.out.println("lastCharIndex = " + lastCharIndex);

        System.out.println("---1 char ---");

        for (int x = 0; x <= lastCharIndex; x++) {

            String currentChar = name.substring(x, x+1);

            if (currentChar.equalsIgnoreCase("a")){
                System.out.println("The index of a or A is " + x);
            }

        }
        System.out.println("---2 char ---");

        for (int x = 0; x <= lastCharIndex-1; x++) {

            String currentChar = name.substring(x, x+2);

            if (currentChar.equalsIgnoreCase("an")){
                System.out.println("The index of 'an' is " + x);
            }

        }
        System.out.println("---3 char ---");

        for (int x = 0; x <= lastCharIndex-2; x++) {

            String currentChar = name.substring(x, x+3);

            if (currentChar.equalsIgnoreCase("Ari")){
                System.out.println("The index of 'Ari' " + x);
            }

        }



    }
}
