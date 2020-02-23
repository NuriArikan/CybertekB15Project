package day35;

public class CharacterPractice2 {
    public static void main(String[] args) {

        char myChar = '7';
        // get int 7
        int myNum = Integer.parseInt(myChar + "");
        System.out.println("myNum = " + myNum);

       // Character.toString(myChar);
       // String.valueOf(myChar);



        String str = "A34B123C4X";

        // for each char in string check if it is number
        // if yes store in a String and use that string to get Integer
        // then sum it up
        char[] allChars = str.toCharArray();

        int sum = 0 ;

        for (char each : allChars ){
            // checking whether each char is a number or not
            if ( Character.isDigit(each)){
                // if its print out to see
                System.out.println("each = " + each);
                int eachNum = Integer.parseInt(each+"");
                sum = sum + eachNum;

            }
        }
        System.out.println("sum = " + sum);













    }
}
