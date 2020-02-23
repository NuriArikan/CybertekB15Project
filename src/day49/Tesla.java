package day49;

public class Tesla extends Vehicle implements Autonomous {


    int horsePower;
    String model;


    @Override
    public void selfDrive() {
        System.out.println("Only on High Way");
    }


    @Override
    public void start() {
        System.out.println("New York");
    }



    public Tesla(int year,int horsePower,String model) {
        super(year);
        this.horsePower=horsePower;
        this.model=model;
    }


    @Override
    public void goForward() {
        super.goForward();
    }


    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {

        Tesla t1 = new Tesla(2020,500,"X");

        t1.start();
        t1.goForward();
        t1.selfDrive();

        System.out.println("t1 = " + t1);





    }


}
