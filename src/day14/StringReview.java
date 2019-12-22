package day14;

public class StringReview {
    public static void main(String[] args) {

        String str = "I like Pumpkin";


        System.out.println( str.equals("I like Pumpkin"));

        // contains
        // it checks whether a string exists in other string
        // and return true or false result
        System.out.println("does it contains Pumpkin : ");

        System.out.println(str.contains("Pumpkin"));

        boolean gotPumpkin = str.contains("Pumpkin");
        // shortcut to print variable value in nice format soutv +tab
        System.out.println("gotPumpkin = " + gotPumpkin);

        // startsWith  endsWith
        boolean startedWithI = str.startsWith("I");
        System.out.println("startedWithI = " + startedWithI);

        boolean endsWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("endsWithPumpkin = " + endsWithPumpkin);









    }
}
