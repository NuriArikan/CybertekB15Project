package day12;

public class WakeUpTask2 {
    public static void main(String[] args) {

        // Season finder

        int month = 4;

        if ( month < 1 || month > 12 ){
            System.out.println("Invalid Month!");
        }else  if ( month >= 3 && month <= 5){
            System.out.println("Spring!");
        } else  if ( month >= 6 && month <= 8){
            System.out.println("Summer!");
        }else  if ( month >= 9 && month <= 11){
            System.out.println("Fall!");
        } else  if ( month == 12 | month == 1 | month == 2){
            System.out.println("Winter!");
        }
        System.out.println("The End");



    }
}
