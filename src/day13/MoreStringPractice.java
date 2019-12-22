package day13;

public class MoreStringPractice {
    public static void main(String[] args) {

        String name = "Nuri";
        System.out.println(name);

        // name = "Arikan";

        // System.out.println( name );

        // String is immutable , one created It can not be changed
        // any String actions/ methods that looks like changing the variable
        // actually creating new variable

        name.toUpperCase();
        System.out.println(name);

        System.out.println(name.toUpperCase());

        // What if I want to change the name

        name = name.toUpperCase();
        System.out.println( name );





    }
}
