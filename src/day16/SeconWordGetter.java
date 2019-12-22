package day16;

public class SeconWordGetter {
    public static void main(String[] args) {

        String word = "I love Java";
        String secondWord ;
        int firstSpaceIndex = word.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex = word.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

        System.out.println( word.substring(2,6));
        secondWord = word.substring(firstSpaceIndex+1 , lastSpaceIndex );
        System.out.println("secondword = " + secondWord );


        String firstWord =word.substring(0, firstSpaceIndex);
        System.out.println("firstWord = " + firstWord);

        String lastWord = word.substring(7);
        System.out.println("lastWord = " + lastWord);

        System.out.println("LastWord =" + word.substring(lastSpaceIndex));











    }
}
