package day32;

public class Number_Action {
    public static void main(String[] args) {

        numberComparision(10,20);

        repeater("Java",4);

        skipCountBy3From0to50(50);

        countFrom50to0OddNumbers(50);

        print1ToX(5);

        countDownByEvenNumberFrom50To0(10,20);

    }
    /*  Create static void methods as below

    numberComparision
    this method has 2 parameters called num1 and num2
    if num1 is more than num2 print num1 is more than num2
    if num2 is more than num1 print num2 is more than num1

    String repeater
    this method has 2 parameters
    String strTorepeat and int repeatingCount
    repeat printing the string as many time as <count> number define

     */


    public static void numberComparision ( int num1 , int num2){

        if ( num1 > num2 ){
            System.out.println("Number 1 is more than Number 2");
        }
         else if( num2 > num1 ) {
            System.out.println("Number 2 is more than Number 1");
        } else {
            System.out.println("Numbers are equal");
        }

    }
    public static void repeater ( String strToRepeat , int repeatingCount ){

        for (int i = 0; i < repeatingCount  ; i++) {

            System.out.print(strToRepeat + " ");
        }
        System.out.println();
    }


    public static void skipCountBy3From0to50 ( int number ){

        for (int i = 0; i <= 50 ; i = i+3) {

            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void  countFrom50to0OddNumbers ( int oddNumber){

        for (int i = 50; i >= 0; i--) {

            if ( i %2 ==1){
                System.out.print("Odd numbers " + i + " ,");
            }

        }System.out.println();
    }
    public static void print1ToX ( int x){

        for (int i = 1; i <= x ; i++) {

            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void countDownByEvenNumberFrom50To0 ( int x , int y ){

        for (int i = x; i >= y ; i--) {

            if ( i %2 == 0){
                System.out.println(i + " ");
            }
        }
        System.out.println();

    }





}
