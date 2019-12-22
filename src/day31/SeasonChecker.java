package day31;
public class SeasonChecker {

    public static void main(String[] args) {

        decideSeasonAction("Winter");
        decideSeasonAction("Summer");

        // a string variable declared and assigned value inside main method
        // it can be accessible in main method
        String mysSeason = "AAAA";
        decideSeasonAction(mysSeason);

       }
    /* write a  static method called decideSeasonAction
    it has one String parameter called season
    inside method
    according to what user passed it should print correct action
     */
    public static void decideSeasonAction ( String season ) {
        // this season method parameter can only be accessible inside method body

        switch (season) {

            case "Spring":
                System.out.println("Walking on beach");
                break;
            case "Summer":
                System.out.println("Feeling");
                break;
            case "Fall":
                System.out.println("Wisdom");
                break;
            case "Winter":
                System.out.println("Drinking Coffee");
                break;
            default:
                System.out.println("Invalid season");

        }


    }
}
