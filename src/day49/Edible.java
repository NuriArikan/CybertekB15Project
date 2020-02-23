package day49;

// interface is like a contract
// once someone sign a contract he/she will provide all the details that he/she must do

// an interface is not a class!
public interface Edible {

    // in interface fields are automatically public static final if not defined so.
    // public static final field naming convention is ALL_CAPS !!
    // you can have as many constants as you want
    public static final boolean IS_HUMAN_FOOD = true;

    // if a method with no-body is not defined public abstract , it is automatically public abstract
    public abstract void eat();
    public abstract void drink();

    // default method was added since java 8 to provide
    // default implementation to not break existing implementing
    // classes have option to use it as  is
    // or override it according to their own requirements
    // the default method only exist in a interface !
    // default keyword here is not an access modifier !
    // A default method must have body !
    public default void digest(){
        System.out.println("You implement to code yourself");
    }




}
