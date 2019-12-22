package day19;

public class LastMinuteGoooaaaaall {
    public static void main(String[] args) {

        // given a string with value
        // find out how many a showed in this String

        String name = "Esra Fidan";

        // System.out.println(name.charAt(0)=='a');

        int countOfA = 0;

        for (int x = 0; x < name.length() ; x++) {

            System.out.println( name.charAt(x) );

            if ( name.charAt(x)== 'a'){
                System.out.println("Bingo Found It!! ");

                ++countOfA;
            }
        }
        System.out.println("countOfA = " + countOfA);



    }
}
