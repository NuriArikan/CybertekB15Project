package day23;

public class StringArrayPractice {
    public static void main(String[] args) {

        String [] shows = {"Orville","Gifted","Game of Throne","Flash","Arrow","Super girl"};

        int showsCount = shows.length;
        System.out.println("shows Count = " + showsCount);

        for (int x = 0; x < showsCount; x++) {

            String currentShow = shows[x];
            System.out.println("Show name is : " + shows[x]);
            System.out.println(currentShow + " has " + currentShow.length() + " letters ");
        }

        String myFavoriteShow = shows[0];
        System.out.println("myFavoriteShow = " + myFavoriteShow);
        System.out.println("My favorite show letters are " + myFavoriteShow.length() );
        System.out.println("myFavoriteShow = " + myFavoriteShow + " and letter count is :" + myFavoriteShow.length());







    }
}
