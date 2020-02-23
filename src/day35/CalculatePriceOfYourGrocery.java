package day35;

public class CalculatePriceOfYourGrocery {
    public static void main(String[] args) {

        String sentence = "I bought 3 tomato and the price was 3.14 each";
        // how much is your final checkout price
        // Hint :
        // the count is always 3rd word
        // the price is always at 2nd word from the last

       // String sentence1 = "I bought 3 tomato and the price was 3,14 each";
       // String sentence = sentence1.replace(",",".");

        String [] splitSentence = sentence.split(" ");
        int amount = Integer.parseInt(splitSentence[2]);
        float price = Float.parseFloat(splitSentence[splitSentence.length-2]);
        float totalPrice = amount * price;
        System.out.println("The total price is: "+totalPrice);




















    }
}
