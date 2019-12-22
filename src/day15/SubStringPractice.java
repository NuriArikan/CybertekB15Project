package day15;

public class SubStringPractice {
    public static void main(String[] args) {

        //  getting the part of the String out of another String
        //
        //              0123456789012345
        String movie = "Lord of The Ring" ;

        // Sub String will return part of another string
        //starting from beginning index until right before ending index

        // I want to get the word 'of' from this movie
        String wordOF = movie.substring(5,7);
        System.out.println("wordOF = " + wordOF);

        String wordTHE = movie.substring(8,11);
        System.out.println("wordTHE = " + wordTHE);

        // Get from the second word till last word
        //                 0123456789012345
        // String movie = "Lord Of The Ring";
        int startingPoint = movie.indexOf(" ") + 1;
        int endingPoint = movie.length() ;

        System.out.println(" second word till last: " + movie.substring(startingPoint));

        String secondWordTillLast = movie.substring(5,16);
        System.out.println("secondWordTillLast = " + secondWordTillLast);

        String lordOF = movie.substring(0,7);
        System.out.println("lordOF = " + lordOF);

        // if i want to start somewhere and just get the rest of the String
        // above method will work , however there is even better method
        String secondToLast = movie.substring(5);
        System.out.println("secondToLast = " + secondToLast);
        // it will just start from that location and get till the end.

        String firstword = movie.substring(12);
        System.out.println("firstword = " + firstword);

        String lastWord = movie.substring(0,5);
        System.out.println("lastWord = " + lastWord);

        String wordOfMedium = movie.substring(5,11);
        System.out.println("wordOfMedium = " + wordOfMedium);

        System.out.println(firstword +" " + wordOfMedium + " " +lastWord);

        // another way:)
        System.out.println( movie.substring(12) + " " + movie.substring(5,11) + " " + movie.substring(0,5) );




    }
}
