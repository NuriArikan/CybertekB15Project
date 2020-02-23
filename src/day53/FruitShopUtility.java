package day53;

public class FruitShopUtility {
    public static void main(String[] args) {

        Fruit f1 = new Apple("Crispy but tasteless", "Hot Red", "Gala");
        Fruit f2 = new Orange("Sour", "Orange", 12);

        displayFruit(f1);
        displayFruit(f2);
        // can we directly pass any object IS-A fruit rather than saving it into a variable
        displayFruit(new Apple("tasteless", "red", "Golden"));

        System.out.println("==================");
        digestBetter(f2);
        digestBetter(new Orange("sweet", "yellowish", 1));

        System.out.println("===================");
        Fruit x = getMyFavoriteFruit();
        x.getDigested();
        System.out.println("B15 favorite fruit = " + x);

        System.out.println("====================");
        System.out.println("getFavoriteByType(1)"  + getFavoriteByType(1));
        System.out.println("getFavoriteByType(2)"  + getFavoriteByType(2));


    }

    public static Fruit getFavoriteByType(int type) {

        if (type == 1) {
            return new Apple("Crispy but tasteless", "Hot Red", "Gala");
        } else if (type == 2) {
            return new Orange("Sour", "Orange", 12);
        } else {
            return null;
        }
    }



    //Create a static method called getMyFavoriteFruit
    // accept no parameter and return your favorite fruit object
    public static Fruit getMyFavoriteFruit(){

        Fruit f = new Orange("Sweet","blue",100);

        return f;

//      return new Orange("Sweet","blue",100);
    }



    // Create a static void method called digestBetter
    // it has a parameter as type Fruit
    // and inside the method , it will digest the Fruit object 4 time then displayInformation
    public static void digestBetter (Fruit anyFruit){
        anyFruit.getDigested();
        anyFruit.getDigested();
        anyFruit.getDigested();
        anyFruit.getDigested();
        System.out.println("anyFruit = " + anyFruit);
    }


    // displayFruit
    public static void displayFruit ( Fruit anyFruit){
        System.out.println("Displaying fruit \n" + anyFruit.toString());
    }


    // sellFruit


    // buyFruit






}
