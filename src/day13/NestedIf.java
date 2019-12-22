package day13;

public class NestedIf {
    public static void main(String[] args) {

        boolean youWantToShop = true;
        String prefernce = "Online";


        if ( youWantToShop == true ){
            System.out.println("YES!");

            if( prefernce.equals("Store")) {
                System.out.println("Going to store for shopping");
            }else {
                System.out.println("Going to online for shopping");
            }

        } else {
            System.out.println("Good job stay home coding !!");
        }




    }
}
