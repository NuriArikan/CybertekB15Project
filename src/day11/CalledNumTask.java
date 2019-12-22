package day11;

public class CalledNumTask {

    public static void main(String[] args) {

        int num = 9;

        System.out.println( num >100 || num < 10);
        System.out.println( num < 10 && num <60);

        // more than 2 conditions at the same time ,  3 conditions
        //true || false --->> true
        System.out.println(  true || false || false  );
        //   true  && false  ----->> false
        System.out.println(  true && true && false  );






    }
}
