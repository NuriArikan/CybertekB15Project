package day12;

public class LoginTask4 {
    public static void main(String[] args) {

        // str.equals("abc")
        // ! str.equals("abc")

        String userName = "user123";
        String password = "pass123";

     //   System.out.println(  userName.equals("user123" ) );
     //   System.out.println( ! userName.equals("user123") );


        if ( userName.equals("user123") && password.equals("pass123") ){
            System.out.println("Login Successful");
        } else if ( ! userName.equals("user123") && password.equals("pass123") ){
            System.out.println("Username is not correct");
        } else if ( userName.equals("user123") && ! password.equals("pass123") ){
            System.out.println("Password not correct");
        } else {
            System.out.println("Username and Password are both wrong!!");
        }



    }
}
