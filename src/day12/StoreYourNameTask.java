package day12;

public class StoreYourNameTask {

    public static void main(String[] args) {


        String name = "nuri";

        // I want to store the result of checking name into a variable
        boolean nameCheckIgnoreCase = name.equalsIgnoreCase("NuRi");
        System.out.println("Does this name has same character without caring about the case");
        System.out.println(nameCheckIgnoreCase);
        //here directly printing without saving into variable

        // this will eventually saving into variable
        System.out.println( name.equalsIgnoreCase("NuRi"));






    }
}
