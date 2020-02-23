package day34;

public class ReturnPractice {
    public static void main(String[] args) {




        printMin4CharacterLengthName("Jon");
        printMin4CharacterLengthName("Java Shark");


    }
    public static void  printMin4CharacterLengthName ( String name ) {

        if ( name.length()<4){
            System.out.println("Invalid Name!!!");
            return ;  // this return is being used to get out of the method early
        }
        System.out.println(name);

    }





}
