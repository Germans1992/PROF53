package lesson2.shape;

public class Rectangle extends Figure {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double area() {
        return a * b;
    }

    @Override
    double perimeter() {
        return 2 * (a + b);
    }
}
