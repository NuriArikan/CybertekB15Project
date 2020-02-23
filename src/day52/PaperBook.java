package day52;

public class PaperBook extends Book implements Readable {

    int weight;

    public PaperBook(String name , String author ,int weight) {
        super(name, author);
        this.weight = weight;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Paper Book's name is "
                + name + " , and the author is "
                + author + " and it weight " + weight + " pound");
    }

    @Override
    public void takeNote() {
        System.out.println("Taking note from " + name);
    }

    @Override
    public void showTableOfContent() {
        System.out.println("Hey");
    }

    @Override
    public void read() {
        System.out.println("Reading the " + name + " of the book");
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }


}
