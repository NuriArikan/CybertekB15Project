package day36;

public class MethodPractice {
    public static void main(String[] args) {


     //   Boolean b = true; // auto boxed it to Boolean Object

        Boolean result1 = checkIfStringHasNumber("ytz13ck");
        System.out.println("result1 = " + result1);

    }

    /**
     *
     * @param str
     * @return
     */
    public static Boolean checkIfStringHasNumber ( String str ) {

        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);

            if (Character.isDigit(eachChar)) {
                return Boolean.valueOf(true);
            }
        }

    return Boolean.valueOf(false);
    }


}
