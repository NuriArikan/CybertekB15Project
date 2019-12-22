package day19;

public class TaksX {
    public static void main(String[] args) {

        String name = "Nuri Arikan";


        for (int x = 0; x < name.length() ; x++) {

            String currentChar =name.substring(x, x+1);
            System.out.println(currentChar);

            if ( currentChar.equalsIgnoreCase("A")){
                System.out.println("Found it!");
                break;
            }

            }


    }
}
