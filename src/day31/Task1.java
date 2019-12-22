package day31;

public class Task1 {
    public static void main(String[] args) {

        // alternatively call using class name
        sayHelloWorld7times();
        // alternatively call using class name
        Task1.sayHelloWorld7times();
        // you can call static method of other class
        // using class.name.methodname(..)
    //    Method_Intro.sayHello();

        calculateMathProblem();
        Task1.calculateMathProblem();

    }
  // Create a method to print 7 line of hello and call it sayHelloWorld7times

    public static void sayHelloWorld7times() {

        // 3 print line statement
        System.out.println("Hello world line 1 ");
        System.out.println("Hello world line 2 ");
        System.out.println("Hello world line 3 ");
        // 2 print statement
        System.out.println("Hello world line 4 ");
        System.out.println("Hello world line 5 ");
        // 2 print line statement
        System.out.println("Hello world line 6 ");
        System.out.println("Hello world line 7 ");


    }
/*
    int num1 = 5;
    double num2 = 3.0d;
    float num3 = 3.0f;
    double result1 = num1 + num2;
    double result2 = num1 - num2;
    double result3 = num1 * num2;
    double result4 = num1 / num2;
    float result5 = num1 / num3;
System.out.println(result1);
System.out.println(result2);
System.out.println(result3);
System.out.println(result4);
System.out.println(result5);

     */
 public  static void calculateMathProblem(){

     int num1 = 5;
     double num2 = 3.0d;
     float num3 = 3.0f;
     double result1 = num1 + num2;
     double result2 = num1 - num2;
     double result3 = num1 * num2;
     double result4 = num1 / num2;
     float result5 = num1 / num3;
     System.out.println(result1);
     System.out.println(result2);
     System.out.println(result3);
     System.out.println(result4);
     System.out.println(result5);

 }



}
