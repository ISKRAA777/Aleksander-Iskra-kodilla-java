package ZAD_0503_Kolekcjonujemy_figury;

public class Circle_ implements Shape {
    private double r;

    public Circle_(double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
