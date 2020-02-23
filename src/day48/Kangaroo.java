package day48;

// a class can implement more than one interface

public class Kangaroo implements Bouncible , BoxerWithBellyPouch {


    String name;
    int jumpDistance;




    @Override
    public void bounce() {
        System.out.println("This " + name + " can jump " + jumpDistance
                + " meters forward and it would be nice to have " + GRAVITY + " gravity");
    }


    // these two method , we are overriding from BoxerWithBellyPouch
    @Override
    public void box() {
        System.out.println("Kangaroo with name " + name + " is boxing");
    }

    @Override
    public void carryChildInThePocket() {
        System.out.println("Kangroo with name " + name + "carry child in the pocket");
    }





    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }



    public void eat(){

    }


}
