package day20;

public class FindDogInASentence {
    public static void main(String[] args) {
        // our approach is doing through the sentence 3 character at a time
        // then if 3 characters happen to be a dog , we print out the index
        String msg = "I like Dog, Dogs are cute , Dogs are friendly ";

        int lastCharIndex = msg.length()-1;

        for (int x = 0; x <= lastCharIndex-2 ; x++) {

            String current3chars = msg.substring(x,x+3);
            // System.out.println(x + " " + msg.substring(x,x+3));

            if ( current3chars.equals("Dog")){
                System.out.println("Bingo !!! at " + x);
            }

        }







    }
}
