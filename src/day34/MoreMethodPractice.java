package day34;

public class MoreMethodPractice {
    public static void main(String[] args) {

        System.out.println(monkeyTrouble(true,true));

        System.out.println(monkeyTrouble(false,false));

        System.out.println(monkeyTrouble(true,false));


    }
    /*
    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
    For example :
    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false
    @param aSmile first monkey smiled or not
    @param bSmile second monkey smiled or not
    @return true only if both monkeys are smiling or not smiling
     */

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        //TODO : Your code goes here

        //return aSmile==bSmile;
//        if ( (aSmile&&bSmile) || (!aSmile && !bSmile )  ) {
//            return true;
//        }else  {
//            return false;
        return   (aSmile&&bSmile) || (!aSmile && !bSmile )  ;


        }
    }







