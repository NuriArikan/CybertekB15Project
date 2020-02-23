package day36;

public class WarmUp1 {
    public static void main(String[] args) {

    // WrapperReview


        Integer i1 = new Integer(100000000);
        Integer i2 = Integer.valueOf(123);


        // is i3 primitive type variable
        // is i3 reference type variable
        // Auto boxing : primitive to wrapper type conversion
        Integer i3 = 45 ; // . --> 45 --> new Integer(45) ;

        int i4 = 54 ;
        // Auto unboxing : wrapper type to primitive type conversion
        int i5 = new Integer(100); // new Integer(100) --> 100

        // Auto boxing and unboxing is unique feature
        // Of conversion between primitive value Wrapper classes objects

        System.out.println("i1 and i2 = " + i1+i2);







    }
}
