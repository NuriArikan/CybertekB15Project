package day11;

public class LogicalOperator_Single {
    public static void main(String[] args) {

        /*
        System.out.println( 7>5 && 1>7);
        System.out.println( 5>5 && 1>7);
        System.out.println( 1>5 && 9>7);


        System.out.println( 7>5 & 1>7);
        System.out.println( 5>5 & 1>7);
        System.out.println( 1>5 & 9>7);

         */

        // System.out.println( 9/0); // eror!! can not by 0

        // System.out.println( 9/0 == 3);

         System.out.println( 5>9 && 9/0==3);
         System.out.println( 5>9 & 9/0==3);

        //   ||  |

        System.out.println( 10 > 5 || 9/0 == 3); //  || first is true, so it will stopped checking for second step
        System.out.println( 10 > 5 | 9/0 == 3); //   | first is true but it would be checking second step because | will not stopped





    }
}
