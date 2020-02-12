package ZAD_0503_Kolekcjonujemy_figury;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeList = new ArrayList<>();

    //konstruktor poniżej
    public ShapeCollector() {
        this.shapeList = shapeList;
    }

    //Shape-klasa  shape-obiekt tej klasy
    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapeList.get(n);
    }

    public List<Shape> showFugures() {
        return shapeList;
    }
}
