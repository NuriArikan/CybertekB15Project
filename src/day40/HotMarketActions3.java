package day40;

public class HotMarketActions3 {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.company = "Apple";
        offer1.location = "Austin";
        offer1.isFullTime = true ;
        offer1.salary = 140000;
        offer1.displayInformation();


        offer1.changeAllInfo("Amazon","Virginia",150000,true);
        offer1.displayInformation();

        // if this guy earn more than 100K
        // move him to Atlanta
        boolean result = offer1.offerBelong100K();
        if ( result == true ){
            offer1.changeLocation("Atlanta");
        }
        offer1.displayInformation();





    }
}
