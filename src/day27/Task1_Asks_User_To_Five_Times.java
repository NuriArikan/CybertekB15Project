package day27;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_Asks_User_To_Five_Times {

    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50,60};

        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));

        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < 5 ; i++) {

            System.out.println("Enter an int number: ");
            int input = scan.nextInt();
            numbers[i] = input;
        }
        System.out.println(Arrays.toString(numbers));

        // Arrays.sort(variableName): sorts the arrays in ascending order

        Arrays.sort(numbers);

        int largestNumber = numbers[numbers.length-1];
        int minumumNumber = numbers[0];
        System.out.println("Largest Number is: " + largestNumber);
        System.out.println("Minumum number is: " + minumumNumber);
        // we sort the index so first one is min num, last index is largest number

        // Task 02;
        // write a program that can find the minimum number








    }
}
