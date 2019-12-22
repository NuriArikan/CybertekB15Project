package day16;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the keyword to search");
        String keywordToSearch = scan.nextLine();

        // String keywordToSearch = "Java";
        String tabTitle = keywordToSearch + " - Google Search" ;

        if ( tabTitle.startsWith(keywordToSearch) && tabTitle.endsWith(" - Google Search")  ) {
            System.out.println("Test Pased");
        } else {
            System.out.println("Test Failed");
        }



    }
}
