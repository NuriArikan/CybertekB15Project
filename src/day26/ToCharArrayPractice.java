package day26;

public class ToCharArrayPractice {
    public static void main(String[] args) {

        // 2 additional String methods related to array
        // toCharArray(), another is split(bySomething)

        String survey = "B15 Online 1 Month Survey";

        char[] surveyChars = survey.toCharArray();

        // how did determine to use char for each ??
        // because each item in char array is char
        for (char each : surveyChars  ){

            System.out.println("each char is : " +each);

        }
        System.out.println("++++++++");


        for (int i = 0; i <surveyChars.length ; i++) {
            System.out.println("each char is : " + surveyChars[i]);
        }



        System.out.println("+++++++");

        // while loop

        int x= 0;

        while( x < surveyChars.length){

            System.out.println("Each Char is : " + surveyChars[x]);
            x++;
        }

        System.out.println("++++++++");

        int y = 0;

        do {

            System.out.println(surveyChars[y]);
            y++;
        }while (y < surveyChars.length);








    }
}
