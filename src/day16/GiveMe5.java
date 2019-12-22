package day16;

import java.util.Scanner;

public class GiveMe5 {
    public static void main(String[] args) {

        // I want to ask user to enter a number
        // I will keep asking until user actually enter number 5

        Scanner scan = new Scanner(System.in);

     //   System.out.println("Give me Five !!!");
     //   int userNumber = scan.nextInt();

     //   if ( userNumber != 5 ){
     //       System.out.println("Hey you did not give me 5!!");
     //   }

        int userNumber = 0;

        while ( userNumber != 5 ){
            System.out.println("Give me Five !!!");
            userNumber = scan.nextInt();
        }


        System.out.println("End of the Program !");

    }
}
