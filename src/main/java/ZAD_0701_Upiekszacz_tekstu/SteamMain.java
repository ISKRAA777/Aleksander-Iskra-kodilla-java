//package ZAD9690_Upiekszacz_tekstu;

import ZAD_0701_Upiekszacz_tekstu.PoemBiutifier;

public class SteamMain {
    public static void main(String[] args) {
        PoemBiutifier poemBiutifier = new PoemBiutifier();
        PoemBiutifier poemBiutifier2 = new PoemBiutifier();
        PoemBiutifier poemBiutifier3 = new PoemBiutifier();
        PoemBiutifier poemBiutifier4 = new PoemBiutifier();

        System.out.println(poemBiutifier.beautify("xxxxxxxx", tekst -> tekst.toUpperCase()));
        System.out.println(poemBiutifier2.beautify("yyyyyyy", text -> "ABC " + text + " ABC"));
        System.out.println(poemBiutifier3.beautify("oooooooo", text -> text + " " + text));
        System.out.println(poemBiutifier4.beautify("uuuuuuuu)", text -> text.replace("e", "c")));
    }
}
