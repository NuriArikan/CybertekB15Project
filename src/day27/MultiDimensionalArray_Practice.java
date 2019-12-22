package day27;

public class MultiDimensionalArray_Practice {
    public static void main(String[] args) {

        String[] developersTeam = {"Vladislav" , "Hasan" , "Tolkun" , "Abide"};
        String[] testerTeam ={"Zhibekchach" , "Mohammed Sohrabi" , "Nursultan"};
        String[] businessAnalysesTeam = {"Lisa","Ershad","Naila"};

        String [] [] scrumTeam = {developersTeam, testerTeam, businessAnalysesTeam} ;

        int maxLength = scrumTeam[0][0].length();
        String longestName = "";

        for ( String [] each1DArray : scrumTeam ) {

            for (String  eachElement : each1DArray){

                if (maxLength < eachElement.length()){
                    maxLength=eachElement.length();
                    longestName = eachElement;
                }
            }
        }
        System.out.println(maxLength);
        System.out.println(longestName);



    }
}
