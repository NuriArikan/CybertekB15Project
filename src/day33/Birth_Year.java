package day33;

public class Birth_Year {
    public static void main(String[] args) {

        System.out.println(calculateAndReturnAge(1985));

    }
    public static int calculateAndReturnAge ( int  age ){

        if ( age >= 1900 && age <= 2020){
            // return 0;
            age =2020 -age;
        }else {
            age = 0;
        }

        return age;
    }






}
