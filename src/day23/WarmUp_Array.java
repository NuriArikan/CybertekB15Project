package day23;

import java.util.Arrays;

public class WarmUp_Array {
    public static void main(String[] args) {

        int [] item = new int []{1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(item));

        item [6] = 7;

        int itemLength = item.length;
        System.out.println("itemLength = " + itemLength);

        int lastItem = itemLength-1;
        int lastItemIndex = item[lastItem];
        System.out.println("lastItemIndex = " + lastItemIndex);


        System.out.println("Last item is : " +item[6]);

        int midItemIndex = itemLength/2;
        System.out.println("midItemIndex = " + midItemIndex);


        int min = item[0];
        int max = item[0];

        for (int x = 0; x < itemLength; x++) {

            if ( item[x]>max){
                max= item[x];
            }
            if (item[x]<min){
                min= item[x];
            }
        }
        System.out.println("Max is : " +max);
        System.out.println("Min is : " +min);

        int sum = 0;

        for (int y = 0; y < itemLength; y++) {

            int currentItem = item[y];
            sum = sum + currentItem;
        }
        System.out.println("sum = " + sum);

       // int sum = 0;
       // for (int index = 0; index < items.length; index++) {
       //     sum= sum + items[index];














    }
}
