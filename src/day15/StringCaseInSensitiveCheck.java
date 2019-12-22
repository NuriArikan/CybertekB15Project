package day15;

public class StringCaseInSensitiveCheck {
    public static void main(String[] args) {

        String name = "Arya Stark";

        System.out.println( name.contains("st"));

        // check whether this name contains st no matter the case
        // so I want to store the uppercase version of this name then check for ST

        String uppercaseName = name.toUpperCase(); // ARYA STARK
        System.out.println("uppercaseName contains ST or not ? " +uppercaseName.contains("ST"));

        String lowerCaseName = name.toLowerCase(); // arya stark
        System.out.println("LowecaseName contains st or not ?" +lowerCaseName.contains("st"));

        // method chaining. combining multiple method call
        // make my name all lowercase (String) then check whether it contains lowercase st

        System.out.println(name.toLowerCase().contains("st"));


    }
}
