package day36;

public class MethodWithWrapperTypes {
    public static void main(String[] args) {

        // i1 is a variable with data type Integer
        // and it can store integer Object
        // whats deal here with 12 ?? --> autoboxing
        Integer i1 = 12 ;
        Integer i2 = 20 ;

        sumAndPrint(i1,i2);

        sumAndPrint(23,10);

    }

    public static void sumAndPrint (Integer num1 , Integer num2 ) {

        System.out.println( num1 + num2 );

    }






}
