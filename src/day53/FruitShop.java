package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitShop {
    public static void main(String[] args) {


        // Actual object type decide what method will be called at run time
        // since actual object is Apple|Orange , at run time it will call overriden version of the method
        // and that's

        Apple a1 = new Apple("Sweet","Red","Fuji");

        // What can I access using reference variable a1
        // a1 has apple as reference type , so we can access anything inside apple
        System.out.println("a1.taste = " + a1.taste);
        System.out.println("a1. color = " + a1.color);
        System.out.println("a1. type = " + a1.type);

        a1.getDigested();

        System.out.println("//---------------------------");

        Fruit f1 = a1 ; // new Apple (sweet , red , Fuji)
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);
        // f1.type // type is not in fruit class
        f1.getDigested();



        String str = null;
//        System.out.println(str.charAt(0));
//        System.out.println(str.bark());
//        System.out.println(str.getDigested());


        //Fruit is reference type , Apple is actual object Type
        Fruit f2 = new Apple("Crispy but tasteless","Hot Red","Gala");
        Fruit f3 = new Orange("Sour","Orange", 12);
        Fruit f4 = new Orange("Very Sweet","Blood Red",10);

        System.out.println("//------------");

        Fruit[] myFruits = { f1,f2,f3,f4 } ;

        for ( Fruit each : myFruits){

            each.getDigested();

        }

        System.out.println("===================");

        // List<Fruit> fruitList = Arrays.asList(f1,f2,f3,f4);

        // this is a just regular list with 4 items pre-filled
        List<Fruit> fruitList = new ArrayList<>( Arrays.asList(f1,f2,f3,f4) );

        for ( Fruit each : fruitList){
            System.out.println("each.toString() = " + each.toString());
            System.out.println("Class type" + each.getClass().getSimpleName());
        }












    }
}
