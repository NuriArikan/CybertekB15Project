package day22;

public class NameInReversedOrder {
    public static void main(String[] args) {

        String msg = "I struggle with Java I like Java I love Java Everything is Awesome!";
        int charCount = msg.length()-1;

        for (int x = 0; x <= msg.length() ; x++) {

            if ( x %2 ==1 ){
                continue;
            }
            String currentChar = msg.substring(x, x+1);

            if (currentChar.equalsIgnoreCase("J")){
                break;
            }
            System.out.println(x + "index" + "currentChar = " + currentChar);
        }














    }
}
