package day26;

import java.util.Arrays;

public class String_Split_Practice {
    public static void main(String[] args) {

        String  students = "Aboos,Zulyar,Zhibek,Hasan,Muge,Orhan, Susan" ;
        // first get all the name into String Array called namesArray

        students = students.replace("","");
        System.out.println("students = " + students);

        String[] namesArrays1 = students.split(",");

        System.out.println(Arrays.toString(namesArrays1));

        System.out.println("length of namesArrays1 is " + namesArrays1.length);
        int studentCount =namesArrays1.length;


        // Spell the name of each person in this format
        // exclude space if you get space in names
        // A-b-b-o-s- ...
        // Z-u-l-y-a-r- ...

        for (int x = 0; x <studentCount ; x++) {

            String name = namesArrays1[x];
            System.out.println("Spelling = " + name);

            for (int i = 0; i < name.length(); i++) {

                System.out.print(name.charAt(i) + "-");

            }

       /*
        String name = namesArrays1[0];

        for (int i = 0; i < name.length(); i++) {

            System.out.print(name.charAt(i) + "-");

        }
        System.out.println();

        String name1 = namesArrays1[1];

        for (int i = 0; i < name1.length(); i++) {

            System.out.print(name1.charAt(i) + "-");

        }
        System.out.println();
        */




            // Optionally count a from each name and print


        }



    }
}
