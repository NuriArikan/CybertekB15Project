package day52.polymorphism;

public class ShapePolymorphism {
    public static void main(String[] args) {

        // Circle s1 = new Circle("penny", 5);

        Shape s1 = new Circle("penny",5);
        printAnyShapeArea(s1);

        Shape s2 = new Rectangle("Book",10,5);
        printAnyShapeArea(s2);

        printAnyShapeArea( new Square("Bob",6));

        //   Object s1 = new Circle("penny",5);
        //   Drawable s1 = new Circle("penny",5);
        //   only the references type decide what you can access with that variable
        //   s1.draw();

        // How do I know what is the actual object type
        System.out.println(s1.getClass().getSimpleName() );

        // We are doing up-casting when we apply polymorphism.
        //for instance: when we write Shape s1 = new Circle (...)--> we are up-casting because Shape is a wider data type
        //than Circle, or when we write Object s1 = new Circle(...) --> we are up-casting because Object is more general
        //than Circle. ( just remember how we were able to store int type into double--similar logic)
        // Circle s2 = new Shape("shape");?????????? check out how this work or not work?? ----> ANSWer from Akbar:
        //Shape is not Circle to start with. and Shape is abstract , it would not matter even if it is not.
        //Shape is not A Circle.

    }
    // create a method that accept any Shape and print out the calculated area
    public static void printAnyShapeArea(Shape anyShape){

        anyShape.calculateArea();
        System.out.println(anyShape.name + " 's area is = " +anyShape.area);

    }





}
