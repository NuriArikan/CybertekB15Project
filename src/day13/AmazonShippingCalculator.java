package day13;

public class AmazonShippingCalculator {
    public static void main(String[] args) {

        /* Amazon has 2 types of user, Prime Member and Regular Member
        Prime membe get free shipping
        Regular user get free shipping only if their purchase is more than 25$
        Otherwise they get 5$ shipping fee

         */

        String memberType = "Prime member";
        double amount = 26d ;
        int shippingFee = 0 ;

        if( memberType.equalsIgnoreCase("prime member")){
            System.out.println("You get 1 day free shipping !");
            System.out.println("Your final price is " +amount);
        }
        // else if ( amount > 25 ) {
         else  if ( ! memberType.equalsIgnoreCase("Prime Member") && amount>25)  {
            System.out.println("Not a Prime member but your order is more than 25");
            System.out.println("You got free shipping on amount " + amount);
        } else {
            System.out.println("Do you wanna sign up for prime membership");
            shippingFee = 5;
            amount += shippingFee ;
            System.out.println("Your final amount is " + amount);
        }

    }
}
