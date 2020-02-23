package day35;
public class WrapperTypePrimitiveTypeConversion {
    public static void main(String[] args) {

        Integer num1 = 100 ;

        // Integer.valueOf(..) is a method that return Integer Object
        // it has 2 overloaded version one that accept number , another accept String
        // But both of them
        int num2 = Integer.valueOf("200");

        //  this cannot happen by itself
        //  int num3 = "200";

        int num3 = Integer.parseInt("200");

        /*
        Integer.parseInt("numberHere")
        it return an int value converted from String

        Integer.valueOf("numberHere")
        it return an Integer Object by wrapping up the number


        You may use whichever you want because:
        Auto-boxing and Auto boxing will take care of the conversion anyway
         */

        // Use this number IPR2012-00001 and store the year into a int variable
        // case number always start with 3 character either IPR , PGR ,CBM , DER
        // followed by year , followed by dash and 5 digit number
        String caseNumber = "IPR2012-00001";
        int year ; // get 2012 out of it

        String strYear = caseNumber.substring(3,7);
        year = Integer.parseInt(strYear);
        System.out.println("strYear = " + strYear);

        System.out.println(getYearOutOfCaseNumber("DER2019-00034")  );
        System.out.println(getYearOutOfCaseNumber("PGR2019-01042")  );
        System.out.println(getYearOutOfCaseNumber("CBM2001-10133")  );


    }
    public static int getYearOutOfCaseNumber (String caseNumber ){

        //

        return  Integer.parseInt(caseNumber.substring(3,7));
    }




}
