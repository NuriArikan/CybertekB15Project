package day21;

public class WarmUp1 {
    public static void main(String[] args) {

        String myName = "Nuri";
        int charCount = myName.length();
        int lastCharIndex = charCount -1;
        //01234
        //Hello
        // int x =0;
     //   System.out.println(myName.substring(x, x+1));
     //   ++ x ; 1
     //   System.out.println(myName.substring(x, x+1));
     //   ++ x ; 2
     //   System.out.println(myName.substring(x, x+1));
     //   ++ x ; 3
     //   System.out.println(myName.substring(x, x+1));
     //   ++ x ; 4
     //   System.out.println(myName.substring(x, x+1));

      // for hello; there is 2 ways to represent when do we keep looping
      // if the x value is less than or equal to 4 x <=
      // if the x value is less then 5 , x<5


        for (int x = 0; x <= lastCharIndex ; x++) {

         //   System.out.print(myName.charAt(x) + "->");

            System.out.print(myName.substring(x, x+1)+"->");

        }

        for (int x = 0; x <= lastCharIndex-1 ; x++) {

            String twoChar = myName.substring(x, x+2);
            System.out.println(twoChar);

        }
        System.out.println("-------");


        for (int x = 0; x <= lastCharIndex-2 ; x++){

            String threeChar = myName.substring(x, x+3);
            System.out.println(threeChar);
        }


    }
}
