package day18;

public class OfficeHour {
    public static void main(String[] args) {

        String item = "Echo Dot (3rd Gen) Charcoal";



        int indexofopeningParenthesis = item.indexOf("(");
        int indexofendingParenthesis = item.indexOf(")");



        String wordInsideParenthesis = item.substring(indexofopeningParenthesis + 1 , indexofendingParenthesis);
        System.out.println("wordInsideParenthesis = " + wordInsideParenthesis);


        //-------------------

        String letters  = "J%a^V**$1a(";


        letters = letters.replace("%", "").
                          replace("^", "").
                          replace("*","").
                          replace("$", "").
                          replace("1","").
                          replace("(","").
                          toUpperCase();


        System.out.println("letters = " +letters);




    }
}
