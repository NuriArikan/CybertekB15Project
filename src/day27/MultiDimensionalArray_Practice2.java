package day27;

public class MultiDimensionalArray_Practice2 {
    public static void main(String[] args) {

        String[] developersTeam = {"Vladislav" , "Hasan" , "Tolkun" , "Abide"};
        String[] testerTeam ={"Zhibekchach" , "Mohammed Sohrabi" , "Nursultan"};
        String[] businessAnalysesTeam = {"Lisa","Ershad","Naila"};

        String [] [] scrumTeam = {developersTeam, testerTeam, businessAnalysesTeam} ;

        int minLength = scrumTeam[0][0].length();
        String shortestString = scrumTeam[0][0];

        for (int i = 0; i < scrumTeam.length; i++) {

            for (int j = 0; j < scrumTeam[i].length; j++) {

                if ( minLength > scrumTeam[i][j].length()){
                    minLength = scrumTeam[i][j].length();
                    shortestString = scrumTeam[i][j];
                }
            }
        }
        System.out.println(minLength);
        System.out.println(shortestString);













    }
}
