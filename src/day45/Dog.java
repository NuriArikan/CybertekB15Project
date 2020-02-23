package day45;

public class Dog extends Animal {


    @Override
    public void speak() {

        System.out.println("Bark!!!");
    }

    public static void main(String[] args) {

        Dog twix = new Dog();
        twix.speak();

    }
    //OVERLOADING VS OVERRIDING
    //Overloading :same method name & different parameter in the same class
    //Overriding : parent child relationship is a MUST
    //has same method name signature & same parameter list ALWAYS

    // Whats Different between overloading and overriding ?? Interview question

    // Overloading occurs when two or more methods in one class have the same method name but different parameters.

    // Overriding means having two methods with the same method name and parameters (i.e., method signature).
    // One of the methods is in the parent class and the other is in the child class.

}
