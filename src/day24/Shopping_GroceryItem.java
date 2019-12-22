package day24;

public class Shopping_GroceryItem {
    public static void main(String[] args) {
                    //       0       1       2          3            4         5
       String[] items  = {"apple","banana","grape","strawberry","blueberry","kiwi"};

       float [] prices = { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  };

       for ( String eachFruit : items){
           System.out.print(eachFruit );

           int itemCount = items.length;
           int lastItemIndex = itemCount -1 ;
           String  lastFruit = items[lastItemIndex];

           // only print --> when the fruit is not last item
           if (! eachFruit.equals(lastFruit)){
               System.out.print(" --> ");
           }








       }















    }
}
