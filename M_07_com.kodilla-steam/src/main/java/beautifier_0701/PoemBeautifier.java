package beautifier_0701;

public class PoemBeautifier {
    public String beautify(String text, PoemDecorator poemDecorator) {
        return poemDecorator.decorate(text);
    }
}
