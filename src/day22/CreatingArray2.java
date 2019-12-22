package day22;

public class CreatingArray2 {
    public static void main(String[] args) {

        int[] ages;
              ages= new int[]{3,5,11,33,57,18};

        int itemCount = ages.length;
        System.out.println("itemCount = " + itemCount);

        for (int x = 0; x < itemCount; x++) {

            System.out.println(x + " index: " + ages[x]);
        }


        // Shortcut of storing is;
        int [] areaCode = {703,300,954,665};


        System.out.println("itemCount = " + itemCount);

        for (int x = 0; x < itemCount; x++) {

            System.out.print(x + " index: " + ages[x] + " , ");
        }





    }
}
