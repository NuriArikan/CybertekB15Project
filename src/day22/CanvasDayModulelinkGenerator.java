package day22;

public class CanvasDayModulelinkGenerator {
    public static void main(String[] args) {

        String baseURL = "https://learn.cybertekschool.com/courses/278/modules# ";
        String dayMsg = "this will lead you to day";

  //      for (int moduleNumber = 3317; moduleNumber <= 3317+25 ; moduleNumber++) {
  //          System.out.println(moduleNumber);

  //      }



        for (int day =1; day <= 22; day++){

            System.out.println(dayMsg +" "+ day);

            System.out.println(baseURL + ( day + 3297) );
        }







    }
}
