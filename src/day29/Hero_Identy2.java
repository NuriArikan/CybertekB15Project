package day29;

public class Hero_Identy2 {
    public static void main(String[] args) {
        // assume this can be different hero
        String hero1 = "Superman-Clark J Kent";

        // hide this hero identity
        // String heroX = "Superman-********";

        // given a String with hero code and name separated by -
        // turns his String into hero code and * with same length as hero name

        // Plain English Logic :

        // split it by - to get the full name
        // get the length of last name
        // generate stars with same length ass full name character count
        // concatenate heroCode with dash and stars and save it

        // OR one the star is generated , replace full name with Stars

        String [] heroSplitted = hero1.split("-");
        String  heroCode = heroSplitted[0];
        String fullName = heroSplitted[1];

        String stars = "" ;
        for (int i = 0; i <= heroSplitted[1].length(); i++) {

            stars += "*";
        }
        System.out.println("stars = " + stars);

        String heroX = hero1.replace(heroSplitted[1],stars);
        System.out.println("heroX = " + hero1.replace(hero1.split("-")[1],stars));
        System.out.println("hero1 = " + hero1);



















    }
}
