package day14;

public class EmailCheckerTask {
    public static void main(String[] args) {

        String email = "nuri@yahoo.com";


        if( !email.contains("@") || email.contains(" ")  ){
            System.out.println("Invalid email");
        } else if ( email.endsWith("@gmail.com")){
            System.out.println("Gmail");
        } else if ( email.endsWith("@yahoo.com")){
            System.out.println("Yahoo email");
        } else if ( email.endsWith("mail.ru")){
            System.out.println("Russian email");
        }

    }
}
