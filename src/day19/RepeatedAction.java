package day19;

import java.util.Scanner;

public class RepeatedAction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int start = scan.nextInt();
        int end = scan.nextInt();

        if ( start<end) {

            for (int i = start; start< end; i++) {

                System.out.println(i + ",");
            }

        } else if ( start>end){

            for (int x = start; x > end ; x--) {
                System.out.println(x + ",");

            }
        } else {
            System.out.println("No Action Needed!!! Same Speed!!!!");
        }

    }
}
