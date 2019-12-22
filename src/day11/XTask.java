package day11;

public class XTask {
    public static void main(String[] args) {

        // and = &&
        // or  = ||

        // && = checks first, if it is false, it is false.. and not checks next steps
        // &  = single and checks every steps.

        int x = 55;

        System.out.println( x > 50 && x != 52 || x == 57);


    }
}
