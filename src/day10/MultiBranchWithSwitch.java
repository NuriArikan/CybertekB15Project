package day10;

public class MultiBranchWithSwitch {
    public static void main(String[] args) {

        //  byte , short , int , char , String (only for switch!!)

        String order = "";
        int itemNumber = 35;

        switch (itemNumber){
            case 11:
                System.out.println("You have selected 11");
                order = "Burger";
                break;
            case 35:
                System.out.println("You have selected 35");
                order = "Ayran";
                break;
            default:
                System.out.println("Unknown");
                break;

        }
        System.out.println("Your order is " + order);


    }
}
