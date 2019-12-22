package day20;

public class PalindromeTest {
    public static void main(String[] args) {
        // if you reverse a String it does not change it means;
        // the string is called Palindrome

        // level , kayak , elle , madam , aziza

        String name = "kayak";
        System.out.println("name = " + name);

        String reservedName = "";

        for (int x = name.length()-1 ; x >=0  ; x--) {

            reservedName = reservedName + name.charAt(x);

        }
        System.out.println("reservedName = " + reservedName);

        if (name.equalsIgnoreCase(reservedName)){

            System.out.println("Palindrome Test has passed");
        }else{
            System.out.println("Palindrome Test has failed");
        }

    }
}
