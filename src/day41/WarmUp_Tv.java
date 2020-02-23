package day41;

public class WarmUp_Tv {

    String name;
    boolean isOn;
    int currentChannel;


    public int getCurrentChannel(){

        return currentChannel;
    }

    public void setCurrentChannel( int newChannel ){

        currentChannel = newChannel ;
    }


    public void  turnOn( ){

        System.out.println("Turning on TV");
        if (isOn==false){
            isOn = true;
        }

    }
    public void turnOff() {

        if (isOn == true) {
            System.out.println("Turning Off TV");
            isOn = false;
        }
    }


    public String toString() {
        return "WarmUp_Tv{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
