package day45;

public class Apple extends Fruit {

    // if we do not have any constructor
    // we will get default constructor
    // and compiler automatically call
    // no arg constructor of super class by inserting super()

    public Apple(){
        super();
    }


//    // First line of any constructor is automatically calling
//    // Super() if we do not call any
//
//    public Apple(){
//        // I want to reuse the functionality
//        // already written in super class constructor
//        // we can use super() or super (Arguments here)
//        // to call super class's constructor
////        super();
//
//        // how to call constructor with 1 argument
//        super("test");
//
//        // can we use this super() call more than once
//        // No !!!
//        System.out.println("Message from Apple Constructor");
//
//    }


    public static void main(String[] args) {

        Apple a1 = new Apple();



    }
}
