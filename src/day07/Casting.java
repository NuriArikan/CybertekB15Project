package day07;

public class Casting {
    public static void main(String[] args) {

       //  int num = 10 ;

        double bigNum = 10 ;

        System.out.println( bigNum );

        // 12.99 is double , double has much bigger range than int
        // so it is just does not fit
        // int num = 12.99; compiler error!!!

        int num = (int) 12.99;
        System.out.println( num );

        long num1 = 123456789L ;
        int num2 = (int) num1 ;
        System.out.println( num2 );






    }
}
