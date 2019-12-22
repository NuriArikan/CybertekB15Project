package day10;

public class SeasonAction {

    public static void main(String[] args) {

        String season = "Fall";



        switch ( season ){
            case "Spring" :
                System.out.println("Hike!");
             break;

            case "Summer" :
                System.out.println("Swim!");
                break;
            case "Fall" :
                System.out.println("Shopping!");
                break;
            case "Winter" :
                System.out.println("Ski!");
                break;
            default:
                System.out.println("Unknown season, Try again!");
                break;
        }


    }
}
