package day08;

public class IfElse_IfElse {
    public static void main(String[] args) {

        int score = 95;

        if ( score > 90){
            System.out.println("Great score : A!");
        } else if (score > 80){
            System.out.println("Good score : B!");
        } else if ( score > 70){
            System.out.println("Pass score : C!");
        } else {
            System.out.println("Bad score : D!");
            System.out.println("Failed!!");
        }

    }
}
