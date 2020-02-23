package day34;

public class LoginActivity {
    public static void main(String[] args) {

        System.out.println(login2("user","abc123"));

        login2("user","abc123");



    }

    public static boolean login2(String username, String passWord){
        if(username.equals("user") && passWord.equals("abc123")){
            return true;
        }else{
            return false;
        }
    }


}
