package day33;
public class MethodWithReurnPractice2 {
    public static void main(String[] args) {

        convertNumberToDay(9);

        int [] bunchOfDaysCode = {5,3,11,4,33};
        System.out.println(    bunchOfDaysCode[0]   );



    }
    // convertNumberToDay
    // This method will take number from 1-7
    // and convert that to actual day in word
    // @param int dayCode to represent day in number
    // @return the day in word in English if the number is valid
    //         if the number is not 1-7 return FUNDAY!
    public static int convertNumberToDay ( int dayCode ){
        int result = 0;
        if ( dayCode ==1 ){
            System.out.println("Monday");
        } else if ( dayCode == 2){
            System.out.println("Tuesday");
        } else if ( dayCode == 3){
            System.out.println("Wed");
        } else if ( dayCode == 4){
            System.out.println("Thursday");
        } else if ( dayCode == 5){
            System.out.println("Friday");
        } else if ( dayCode == 6){
            System.out.println("Saturday");
        } else if ( dayCode == 7){
            System.out.println("Sunday");
        } else {
            System.out.println("FUNDAY!");
        }
        return dayCode;
    }


}
