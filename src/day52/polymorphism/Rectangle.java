package day52.polymorphism;

public class Rectangle extends Shape {

    int width;
    int height;

    public Rectangle(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public Rectangle(String name) {
        super(name);
    }


    @Override
    public void calculateArea() {

    }

    @Override
    public void draw() {

    }


}
