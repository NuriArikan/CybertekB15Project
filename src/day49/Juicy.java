package day49;

// Interface can achieve loosly coupling between implementing classes
// for example : When we say flyable
// all the implementing classes like Plane, Insects , ...
// can be all Flyable and has nothing to do with each other
// and almost no knowledge about each other : known as loosely coupling
// This is why it is always preferred in design



public interface Juicy {

    public abstract void melt();

        // another type of method Interface can have is :
        // static method , it must have a body
        // and it is there to provide some utility methods
        // that does not belong to any class
        // Static methods of interface are not inherited !!
        // It must have a body !
        public static void squeeze(){
            System.out.println("static squeezing");
        }

}
