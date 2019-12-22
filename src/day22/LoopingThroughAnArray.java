package day22;

public class LoopingThroughAnArray {
    public static void main(String[] args) {


        int [] scores  = new int[4];

        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        // how do we get the size of any array objects
        int itemCount = scores.length;
        int lastItemIndex = itemCount-1;


           for (int x = 0; x <= lastItemIndex ; x++) {
               System.out.println(scores[x]);
           }

        // print this array in reverse order

        for (int x = 0; x < itemCount; x++) {
            System.out.println(x + " index: " + scores[x]);
        }






    }
}
