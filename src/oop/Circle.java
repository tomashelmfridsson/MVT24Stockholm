package oop;

public class Circle {
    private int radie;

    public Circle(int r) {
        setRadie(r);
    }

    private void setRadie(int r) {
        radie = r;
    }

    public double calculateArea() {
        return radie * radie * 3.14;
    }

    public boolean isBiggerThan(Circle circle) {
//        System.out.println("Radien på frågande objekt " + this.radie);
//        System.out.println("Radien på attributets objekt " + circle.radie);
//        System.out.println("Arean på frågande objektet " + this.calculateArea());
//        System.out.println("Arean på attributets objekt " + circle.calculateArea());
        return (this.calculateArea() > circle.calculateArea());
    }
}
