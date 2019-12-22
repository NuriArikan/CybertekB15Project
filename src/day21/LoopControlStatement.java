package day21;

public class LoopControlStatement {
    public static void main(String[] args) {

        // break
        // if line contains break reaches, the loop will stop !!!


        for (int i = 1; i <=10 ; i++) {

            System.out.println(i);
            break;

        }

        // while iterating over 1 to 10
        // break out of the loop when its 5

        for (int i = 1; i <=10 ; i++) {

            System.out.println(i);
            if (i==5){
                break;
            }

        }

        int sum = 0;

        for (int x = 1; x <= 10 ; x++) {

            System.out.println("Current sum is " + sum);
            System.out.println("If I add " + x + " dollar, it would be " +(sum+x));


            if (sum + x > 12){
                break;

            }
            sum = sum + x;
        }
        System.out.print("sum = " +sum);

        // continue
        // if line contains break reaches, the loop will skip to next iteration

        // WE CAN USE break and continue for any type of loop







    }
}
