package ZAD_0503_Kolekcjonujemy_figury;

public class Triangle implements Shape {
    private double a, h;

    //konstruktor poniżej - tworzy obiekty klasy
    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        return .5 * a * h;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", h=" + h +
                '}';
    }
}
