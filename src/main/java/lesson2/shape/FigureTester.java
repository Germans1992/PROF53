package lesson2.shape;

public class FigureTester {
    public static void main(String[] args) {

        Figure[] figures = new Figure[1000];

        figures[0] = new Circle(15);
        System.out.println(figures[0].perimeter());
        System.out.println(figures[0].area());


        figures[1] = new Triangle(3, 3, 3, 17, 13);
        System.out.println(figures[1].perimeter());
        System.out.println(figures[1].area());


        figures[2] = new Rectangle(3, 5);
        System.out.println(figures[2].perimeter());
        System.out.println(figures[2].area());


        System.out.println("Perimeter: " + perimeter(figures));
        System.out.println("area: " + area(figures));
    }


    public static double perimeter(Figure[] figures) {

        double sumPerimeter = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i] != null)
                sumPerimeter += figures[i].perimeter();
        }
        return sumPerimeter;
    }

    public static double area(Figure[] figures) {
        double sumArea = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i] != null)
                sumArea += figures[i].area();
        }
        return sumArea;
    }
}

