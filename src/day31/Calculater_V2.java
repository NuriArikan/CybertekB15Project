package day31;
public class Calculater_V2 {
    public static void main(String[] args) {

//        char operator = '*' ; // it can be + - / *
//        int num1 = 15 ;
//        int num2 =  3 ;
        calculater(10,30,'-');
        calculater(20,10,'+');
        calculater(40,3,'*');
        calculater(40,4,'/');
        calculater(40,4,'A');

    }
    public static void calculater (  int num1 , int num2 , char operator ){

        switch (operator){

            case '+' :
                System.out.println("Addition result is " + (num1+num2));
                break;
            case '-' :
                System.out.println("Substraction result is " + (num1-num2));
                break;
            case '*' :
                System.out.println("Multiplication result is " + (num1*num2));
                break;
            case '/' :
                System.out.println("Division result is " + (num1/num2));
                break;
            default:
                System.out.println("Invalid Operator");
        }



    }





}
