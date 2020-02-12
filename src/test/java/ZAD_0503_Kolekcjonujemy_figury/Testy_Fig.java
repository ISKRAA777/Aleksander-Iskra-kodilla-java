//package ZAD9492_Kolekcjonujemy_figury;
//
//import org.junit.Test;
//
//public class Testy_Fig {
//    @Test
//    public void shouldAddFigure() {
//        Shape square = new Square(4);
//        ShapeCollector shapeCollector = new ShapeCollector();
//        assertEquals(0, shapeCollector.showFigures().size());
//        shapeCollector.addFigure(square);
//        assertEquals(1, shapeCollector.showFigures().size());
//    }
//
//    @Test
//    public void shouldRemoveFigure() {
//        Shape square = new Square(4);
//        ShapeCollector shapeCollector = new ShapeCollector();
//        assertEquals(0, shapeCollector.showFigures().size());
//        shapeCollector.addFigure(square);
//        assertEquals(1, shapeCollector.showFigures().size());
//        shapeCollector.removeFigure(square);
//        assertEquals(0, shapeCollector.showFigures().size());
//    }
//
//    @Test
//    public void shouldGetOneFigure() {
//        Shape square = new Square(4);
//        ShapeCollector shapeCollector = new ShapeCollector();
//        assertEquals(0, shapeCollector.showFigures().size());
//        shapeCollector.addFigure(square);
//        assertEquals(square, shapeCollector.getFigure(0));
//    }
//}
