package day34;

public class MethodOverloadingPractice {
    public static void main(String[] args) {

        add(15);
        add(15,45);


    }
    public static void add (int i){
        System.out.println(i+100 + "calling add  (int i)");
    }
    public static void add ( int a , int b ){
        System.out.println(a+b +" calling add (int a, int b) ");
    }


}
