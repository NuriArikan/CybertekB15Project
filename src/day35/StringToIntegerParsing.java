package day35;

public class StringToIntegerParsing {
    public static void main(String[] args) {

        // I have an employee ID: "FB-457"

        String strNum = "100";
        int num = Integer.parseInt(strNum);
        System.out.println("num = " + num );

        String empID = "FB-457";
        // integer class is class coming from java.lang package
        // it is primarily used for wrapping up primitive value and treat it as
        // what we will focus here is though
        // many useful static methods it provide already
        // parseInt is a static method of Integer class

        int id = Integer.parseInt(empID.split("-")[1]);
        System.out.println("id = " + id);




        // I have a String called twoNumbers
        String num1Str ="100";
        String num2Str ="600";
        // I want you to add them and give the result 700

        // in order to perform arithmatic operation
        // we must have numbers stored in int
        // so first we need to turn string into int
        // JDK already provide such methods
        // and it comes from Integer class from java.long package
        // Integer.parseInt ("yourNumberInString")
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        System.out.println("Sum of num1 and num2 = " + (num1+num2));
















    }
}
