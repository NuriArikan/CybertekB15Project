package day51.polymorphim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {

        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();

//        s1.draw();
//        s2.draw();
//        s3.draw();

        // please create Array of shape to store
        // 5 concrete Shape Object
        // and call the draw the method on each of them

        // Also try to create ArrayList of Shape
        // and store 4 concrete Shape objects
        // and call the draw method on each of them


        Shape[] geometry ={s1,s2,s3};
        for (Shape each:geometry){
            each.draw();
        }

        System.out.println("====");

        ArrayList<Shape> lstOfShapes = new ArrayList<>(Arrays.asList(s1,s2,s3));
        for (int i = 0; i < lstOfShapes.size() ; i++) {
            lstOfShapes.get(i).draw();
        }



    }
}
