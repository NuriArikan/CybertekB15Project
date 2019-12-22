package day19;

public class CharAndForLoop {
    public static void main(String[] args) {

        int x = 'A';
        char myChar = 'A';

        System.out.println(x);

        System.out.println(myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);

        for ( char iChar = 'A' ; iChar<='Z' ; iChar++ ){
            System.out.println( iChar + " ");
        }


    }
}
