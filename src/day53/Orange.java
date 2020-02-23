package day53;

public class Orange extends Fruit {

    int CLevel;

    public Orange(String taste, String color, int CLevel) {

        super(taste, color);
        this.CLevel = CLevel;

    }

    @Override
    public void getDigested() {
        System.out.println("Orange with vitamin C level " + CLevel + " has color"
                + color + " and it has " + taste + " taste when you digest");
    }

    @Override
    public String toString() {
        return "Orange{" +
                "CLevel=" + CLevel +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
