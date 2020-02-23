package day54.animals;

public abstract class Animal {

    public abstract void speak();


}

    class Dog extends Animal implements IndoorPet {

        String name ;

        public Dog(String name) {
            this.name = name;
        }

        @Override
        public void speak() {
            System.out.println("Bark");
        }

        @Override
        public void play() {
            System.out.println("Running after the ball");
        }
    }