package day33;

public class WarmUp {
    public static void main(String[] args) {

        String spelledName = getSpelledName("Serra");
        System.out.println("spelledName = " + spelledName);

        System.out.println(getSpelledName2("Nuri"));

    }

    /*
    getSpelledName
    This method will put dash in between given String
    @param name this is the name parameter
    @return the name has dash in between
    */
    public static String getSpelledName ( String name ){

        String result = "";

        for (int x = 0; x < name.length() ; x++) {

            result = result + name.charAt(x);
            if ( x != name.length()-1){
                result = result + "-" ;
            }
        }
        return result ;
    }

    /*
    getSpelledName2
    This method will put dash in between given String
    @param name this is the name parameter
    @return the name has dash in between
    */
    public static String getSpelledName2 ( String name ){

        String result = "";
        // keep adding dash until right before last character
        // then concatenate last character
        for (int i = 0; i < name.length() - 1; i++) {
            // this loop will add dash after each character
            // until 2nd character from the last
         result += name.charAt(i)+"-";

        }
        return result+ name.charAt(name.length()-1);
    }








}
