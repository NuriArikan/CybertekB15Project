package day22;

public class ArrayIntro {
    public static void main(String[] args) {

        //array size : 4 items
        int [] scores  = new int[4];

        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        System.out.println( scores[0] );
        System.out.println( scores[1] );
        System.out.println( scores[2] );
        System.out.println( scores[3] );

        // updating the value at certain index
        scores[1] = 99 ;
        System.out.println(scores[1]);

        // Once array is created with certain size , we CANNOT CHANGE THE SIZE !!!

        // when you crate new array object
        // it will get default value in each element
        int [] numbers = new int[3] ;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        // create an byte array with size 4
        // and store it into a variable called data
        byte [] data = new  byte[4];

        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        data[3] = 40;

        System.out.println( data[0] );
        System.out.println( data[1] );
        System.out.println( data[2] );
        System.out.println( data[3] );

        // update last index value
        data[3]=50;
        System.out.println(data[3]);




        // for (int i = 0; i <= 3; i++) {
       //     System.out.println(scores[i]);
       // }




    }
}
