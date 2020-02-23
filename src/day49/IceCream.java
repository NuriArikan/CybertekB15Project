package day49;

// Can a class both extend another class and implement an interface ?
//  a class can only extends one other class
// a class can implements multiple interface
public class IceCream extends Object implements Edible {

    @Override
    public void digest() {
        System.out.println("Digesting burger by chewing more");
    }

    @Override
    public void eat() {
        System.out.println("Eat with spoon!!");
    }

    @Override
    public void drink() {
        System.out.println("Drink it if it has melted in the cup");
    }


    public static void main(String[] args) {

        IceCream i1 = new IceCream();
        i1.drink();
        i1.eat();
        System.out.println(  i1.toString()  );

        i1.digest();

        // Object o1 = new Object();
        // since Object class exists , we can create object out of it


    }



}
