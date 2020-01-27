package ZAD9492_Kolekcjonujemy_figury;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle_(4);
        Shape square = new Square(3);
        Shape triangle = new Triangle(5, 9);
        System.out.println(circle.getShapeName());
        System.out.println(circle.getField());

        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        System.out.println(shapeCollector.showFugures());
    }
}
