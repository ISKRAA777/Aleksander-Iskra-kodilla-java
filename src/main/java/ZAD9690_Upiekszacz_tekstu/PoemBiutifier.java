package ZAD9690_Upiekszacz_tekstu;

public class PoemBiutifier {
    // poniżej - metoda Stwórz klasę PoemBeautifier, która będzie posiadała metodę beautify, której
    // jako parametry będzie można przekazać tekst do upiększenia oraz wyrażenie lambda upiększające tekst.
    public String beautify(String tekst, PoemDecorator poemDecorator) {
        return poemDecorator.decorate(tekst);
    }
}
