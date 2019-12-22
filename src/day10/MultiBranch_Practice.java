package day10;

public class MultiBranch_Practice {
    public static void main(String[] args) {

        System.out.println("Welcom to McDonald!");

        String order = "";
        int itemNumber = 35;

        if (itemNumber == 11) {
            System.out.println("You have selected 11");
            order = "Burger";
        }else if ( itemNumber == 5){
            System.out.println("You have selected 5");
            order = "French Fry";
        }else if ( itemNumber == 8) {
            System.out.println("You have selected 8");
            order = "French Fry";
        }else if ( itemNumber == 35) {
            System.out.println("You have selected 35");
            System.out.println("Enjoyed");
            order = "French Fry";
        }else {
            System.out.println("Unknown");
            order = "Unknown";
        }
        System.out.println("Your order is " + order);


    }
}
