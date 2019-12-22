package day31;


public class Method_Intro {

   // Main method ends here!!!!!!


    // Do not create a method inside main method
    // It can be anywhere inside the class outside main method
    public static void sayHello () {

        System.out.println("Hello World");
        System.out.println("My name is Nuri");
        System.out.println("I love Java");


    }

    public static void main(String[] args) {

        // two ways to call satatic methods
        // Class.namemethodName(external data if I needed)
        // if you are in same class
        // you can directly called them
        // methodName (external data if needed)
    //    Method_Intro.sayHello(); // optional if you are in same class
        System.out.println("Begin");
        sayHello();
        System.out.println("=====");
        sayHello();
        System.out.println("The End");
        // 12---> 13 (21,23,24,25) -->14-->15(21,23,24,25) ->16-> Done!!!







    }






}
