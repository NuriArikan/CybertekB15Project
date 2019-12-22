package day09;

public class DayPrinterVersion2 {
    public static void main(String[] args) {

        int daycode = 5;
        String dayName = ""; // assign the an empty String value

        if ( daycode == 1) {
            dayName = "Monday";

        } else if ( daycode == 2){
            dayName = "Tuesday";
        } else if ( daycode == 3){
            dayName = "Wednesday";
        } else if ( daycode == 4){
            dayName = "Thursday";
        }else if ( daycode == 5) {
            dayName = "Friday";
        }else if ( daycode == 6) {
            dayName = "Saturday";
        }else if ( daycode == 7){
            dayName = "Sunday";
        } else  {
            dayName = "Unknown";
        }
        System.out.println("Day is " + dayName);

    }
}
