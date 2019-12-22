package day11;

public class LogicalOperators {
    public static void main(String[] args) {

        // in java there is no range check directly like math
// for example   int x = 70
// in math  :     60 < x < 100   -->>  true < 100
// in Java  :      x > 60  && x <100
// && 2 ampersand  & 1 ampersand   -->> Logical AND operator
        // This is used to check both conditions are true at the same time
// Think about login example
// only when your username is right and your password is right at the same time
// then you will be able to login
/*                  true       true
* int x = 70 ;    x > 60  && x <100 ;  true
*
                    false      true
* int x = 10 ;    x > 60  && x <100 ;  false
*
                    true       false
 *int x = 110 ;   x > 60  && x <100 ;  false
 *
                    true       true
 *int x = 99 ;    x > 60  && x <100 ;  true
 *
 *
* */
        /*
        ||2 pipe or  |1 pipe is used for compiling 2 conditions:
        Logical OR Operator
        If you have 2 conditions to check
        When will this be true  :As long as one side is true, whole result will be true
        // think about buying milk from 2 stores :
        As long as you found the milk in one store, you got the milk then you get out !
                How do I type pile character on keyboard   |   —>>shift \
        As long as one side is true whole result will be true
                / *
        true false
        int x = 70;
        x > 10 || x < 5      —>>true
        false. false
        int x = 7;
        x > 10 || x < 5      —>>false
        true. false
        int x = 17;
        x > 10 || x < 5      —>>true
        false true
        int x = -8;
        x > 10 || x < 5      —>>true
        * /

        // combining multiple condition togerge r
        // in java there is no range check directly like math
        // for example   int x = 70
        // in math  :     60 < x < 100   -->>  true < 100
        // in Java  :      x > 60  && x <100
        // && 2 ampersand  & 1 ampersand   -->> Logical AND operator
            // This is used to check both conditions are true at the same time
        // Think about login example
        // only when your username is right and your password is right at the same time
        // then you will be able to login
        /*                  true       true
        * int x = 70 ;    x > 60  && x <100 ;  true
        *
                            false      true
        * int x = 10 ;    x > 60  && x <100 ;  false
        *
                            true       false
         *int x = 110 ;   x > 60  && x <100 ;  false
         *
                            true       true
         *int x = 99 ;    x > 60  && x <100 ;  true
         *
         *
        * */
        System.out.println( "TRUTH TABLE ");
        System.out.println( "RESULT OF true && true  is " +   (true && true)    );
        System.out.println( "RESULT OF false && true  is " +  (false && true)    );
        System.out.println( "RESULT OF true && false  is " +  (true && false)    );
        System.out.println( "RESULT OF false && false  is " + (false && false)    );

        System.out.println( "TRUTH TABLE ||");

        System.out.println( "TRUTH TABLE ");
        System.out.println( "RESULT OF true || true  is " +   (true || true)    );
        System.out.println( "RESULT OF false || true  is " +  (false || true)    );
        System.out.println( "RESULT OF true || false  is " +  (true || false)    );
        System.out.println( "RESULT OF false || false  is " + (false || false)    );
    }
}
