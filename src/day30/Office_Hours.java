package day30;

public class Office_Hours {
    public static void main(String[] args) {


        String employee = "Philipa Salthouse [Electrical Engineer] psalthouse.co";
        // print job title from this String : Electrical Engineer

        // Logic : title is in between [and] so we need to find index of [ and ]
        // and use substring (right after index of [ , index of ])

        int startingIndex = employee.indexOf("[") + 1;
        int endingIndex = employee .indexOf("]") ;

        String title = employee.substring(startingIndex,endingIndex);
        System.out.println("title = " + title);

        // print all FirstName-LastName jobTitle
        // logic : get first name (first word in this sentence
        //         get last name ( second word in this sentence ) put dash in between
        //         then concanate with the title
        // this will break if we have name more than 2 words

        // logic 2 : get the full name directly using subString
        //           replace all the space in full name with -
        //           then concatenate with the title


        String fullName = employee.substring(0,employee.indexOf(" [")) ;
        System.out.println("fullName = " + fullName);
        // Philipa-Salthouse Electrical Engineer
        String fullNameWithDash = fullName.replace(" ", "-");
        System.out.println("fullNameWithDash = " + fullNameWithDash);

        System.out.println(fullNameWithDash + " " + title);
        System.out.println(fullName + " " + " is " +title);

        if ( title.equals("Electrical Engineer")  ){

            System.out.println("Pass: Verification succeesful");

        } else {
            System.out.println("Fail: Verification fail : " + title );
        }


        // Task: print Initials -> Job title for everyone
        // PS -> Electircal Engineer

        // logic : get the first word and last word of your full name and get first caharacters of both
        //       a full name might contains more than 2 words but we only want to 2 characters for initials
        //       I already have variable fullname that contains fullname
        // Bruce D Wayne --> BW
        // get first character using charAt(0) ,
        // get lastname first character using charAt( lastIndexOfSpace + 1 )
        System.out.println( fullName.charAt(0) + "" +
                            fullName.charAt(fullName.lastIndexOf(" ")+1)
                            +  " -> " + title);























    }
}
