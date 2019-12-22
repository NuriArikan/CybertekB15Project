package day15;

public class ReplaceMethod {
    public static void main(String[] args) {

        String message = "I love Pumpkin , Pumpkin IS FUN";

        message.replace("Pumpkin", "Java!");

        System.out.println(message);

        String messade2 = "Happy Thanks Giving to All!!";
        // "Happy Thanksgiving to All!!"
        messade2 = messade2.replace("Thanks Giving", "Thanksgiving");
        System.out.println("message2 = " + messade2);


        // I want to replace space from everywhere
        messade2 = messade2.replace("","");
        System.out.println("message2 = " + messade2);

        String message3 = "Tomorrow is OFF NO!" ;
        message3 = message3.replace("NO","");
        System.out.println("message3 = " + message3);


    }
}
