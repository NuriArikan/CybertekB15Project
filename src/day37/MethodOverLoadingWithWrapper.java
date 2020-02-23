package day37;

public class MethodOverLoadingWithWrapper {
    public static void main(String[] args) {

        printNum(100);

        printNum(Integer.valueOf(150));


    }

    public static void printNum ( int x ){
        System.out.println("printing primitive int x = " + x);
    }

    public static void printNum ( Integer x ) {
        System.out.println("Printing Integer Object x = " + x);
    }






}
