package day52;

public class AudioBook extends Book {

    double duration;

    public AudioBook(String name, String author, double duration) {
        super(name, author);
        this.duration = duration;
    }

    public void listen() {
        System.out.println("listening the audio book " + name + " by " + author);
    }

    // this is abstract method implementation from Book class

    // this is abstract method implementation from KnowledgeBank interface




    @Override
    public void takeNote() {
        System.out.println("Taking notes on the digital book by " + name +
                "writing the provided digital table ");

    }

    // this is abstract method implementation from KnowledgeBank interface
    @Override
    public void showTableOfContent() {

        System.out.println("If you want to see Table of Content of " + name
                + " by " + author + " press ...");

    }

    @Override

        public void displayBookInfo() {
            System.out.println("The name of audioBook is " + name
                    + " and the author is " + author +
                    ", the duration is " + duration + " min");
        }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
