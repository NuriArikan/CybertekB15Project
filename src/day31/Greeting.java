package day31;

public class Greeting {

    public static void main(String[] args) {

    //    sayHell0();
        sayHelloTo("Batch 15" );  // ---> print hello Batch 15
        sayHelloTo("Kids" );      // ---> print hello Kids

        sayHelloTo("Study Hard");

    }
    // I want to create a massege that do below :
    // say hello to the person's name I passed when I call this method

    // (String str) this is called method parameter
    // it is used to tell called of this method ,
    // it is expecting this type of data when being called


    public static void sayHelloTo( String str ){

        System.out.println("Hello " + str);
    }


    /*
    public static void sayHell0(){

        System.out.println("Hello B15");
    }
    */



}
