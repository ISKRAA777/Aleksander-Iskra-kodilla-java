package beautifier_0701;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        PoemBeautifier poemBeautifier2 = new PoemBeautifier();
        PoemBeautifier poemBeautifier3 = new PoemBeautifier();
        PoemBeautifier poemBeautifier4 = new PoemBeautifier();

        System.out.println(poemBeautifier.beautify("ocean", text1 -> text1.toUpperCase()));
        System.out.println(poemBeautifier2.beautify("Tommy", text -> "ABC " + text + " ABC"));
        System.out.println(poemBeautifier3.beautify("nothing to do", text -> text + " " + text));
        System.out.println(poemBeautifier4.beautify("moon)", text -> text.replace("e", "c")));

    }
}
