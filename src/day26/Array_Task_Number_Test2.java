package day26;

public class Array_Task_Number_Test2 {
    public static void main(String[] args) {

        int [] scores = {156,101,76,187,87,110};

        // break  as long one number is less than 100 after assigning final result to NO
        // if we never go inside condition, the final result will remain YES

        String finalresult = "YES";

        int size = scores.length;

        for ( int eachNum : scores) {

            if (eachNum <= 100){

                finalresult = "NO";
                break;
            }


        }
        System.out.println("finalresult = " + finalresult);






    }
}
