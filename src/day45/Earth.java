package day45;

public class Earth extends Planet {

//    double gravity ;
//    int radius ;
//    boolean hasLife;

   int population;


    public Earth(double gravity, int radius, boolean hasLife, int population) {
       super(gravity, radius, hasLife);
//        this.gravity = gravity;
//        this.radius = radius;
//        this.hasLife = hasLife;
        this.population = population;

    }

    public static void main(String[] args) {

        Earth e1 = new Earth(9.81,5000,true,100000);
        System.out.println("e1 = " + e1);

    }

    @Override
    public String toString() {
        return "Earth{" +
                "population=" + population +
                ", gravity=" + gravity +
                ", radius=" + radius +
                ", hasLife=" + hasLife +
                '}';
    }
}
