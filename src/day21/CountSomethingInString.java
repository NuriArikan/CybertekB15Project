package day21;

public class CountSomethingInString {
    public static void main(String[] args) {

                    // 01234567890
        String name = "Nuri Arikan";

        int charCount = name.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount -1 ;
        System.out.println("lastCharIndex = " + lastCharIndex);


        int counter = 0 ;

        for (int x = 0; x <= lastCharIndex-2; x++) {

            String currentChar = name.substring(x, x+3);

            if (currentChar.equalsIgnoreCase("Ari")){
                System.out.println("The index of 'Ari' " + x);

                counter ++;
            }

        }

        System.out.println("Counter is " + counter);



    }
}
