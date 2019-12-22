package day11;

public class TaskForTrueFalseToScore {

    public static void main(String[] args) {

        int scoreAssign = 75;

        if ( scoreAssign < 0 || scoreAssign > 100){
            System.out.println(" Invalid Score!");
        } else if ( scoreAssign == 100){
            System.out.println("Perfect Score!");
        } else if ( scoreAssign > 70 && scoreAssign < 100) {
            System.out.println(" You have Passed!");
        } else if ( scoreAssign < 20 ){
                System.out.println(" Come to my office");
        } else if ( scoreAssign > 30 && scoreAssign < 40){
            System.out.println(" Attend additional classes");
        }else if ( scoreAssign > 40 && scoreAssign < 70){
            System.out.println(" Little bit more study will let you pass");
        } else {
            System.out.println("You have failed");
        }





    }
}
