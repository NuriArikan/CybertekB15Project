package day41;

public class WarmUp_TvStore {

    public static void main(String[] args) {

        WarmUp_Tv t1 = new WarmUp_Tv();
        t1.name = "Sony";
        t1.currentChannel=2000;

        System.out.println("t1 = " + t1.toString());

        t1.turnOn();

        t1.setCurrentChannel(12);

        System.out.println( t1.getCurrentChannel() );
        t1.turnOff();


        System.out.println("t1 = " + t1.toString() );











    }
}
