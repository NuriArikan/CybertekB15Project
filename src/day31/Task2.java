package day31;

public class Task2 {

    // write a piece of reusable code to count from 1 to 10
    // give a name count1to10                           : method name
    // no need for object when being called             : static
    // it should be accessible anywhere in your project : public
    // it does not return any value                     : void

    public static void spellYourName(){

        String name = "Nuri";

        for (int i = 0; i < name.length()-1; i++) {

            System.out.println(name.charAt(0) + "-" +
                            name.charAt(1) + "-" +
                            name.charAt(2) + "-" +
                            name.charAt(3)
                    );
        }
    }

    public static void count1to10() {

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void countDownFrom20till1() {


        for (int x = 20; x >= 1; x--) {

            System.out.print(x + " ");
        }

    }

    public static void printOddNumbers1to100() {


        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 1) {
                System.out.println("Odd Numbers :" + i);
            }
        }

    }
    public static void main(String[] args) {

          count1to10();
    //    System.out.println(); // empty line for out put is not together
          count1to10();
    //    Optionally
          Task2.count1to10();

          countDownFrom20till1();

          printOddNumbers1to100();

          spellYourName();

          // countDownFrom20till1
          // odd numbers from 1-100 ; printOddNumbers1to100()
          // create a method to spell your name : Nuri --> N-u-r-i
    }
}
