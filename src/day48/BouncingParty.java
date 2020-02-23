package day48;

public class BouncingParty {

    public static void main(String[] args) {

        Kangaroo k1 = new Kangaroo("Coco",10);

        k1.bounce();
        k1.eat();
        k1.carryChildInThePocket();
        k1.box();

        Bouncible k2 = new Kangaroo("Toto",6);
        k1.bounce();


        Ball b2 = new Ball ("Round","Blue");
        System.out.println("b2 = " + b2);
        b2.bounce();



        System.out.println(Bouncible.GRAVITY);






    }
}
