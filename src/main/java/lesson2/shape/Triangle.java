package lesson2.shape;

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;

    private double width;
    private double height;


    public Triangle(double a, double b, double c,double width,double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.width = width;
        this.height = height;
    }

    @Override
    double area() //Площадь
    {
 return width * height / 2;
    }

    @Override
    double perimeter()
    {
        return a + b + c;
    }
}
