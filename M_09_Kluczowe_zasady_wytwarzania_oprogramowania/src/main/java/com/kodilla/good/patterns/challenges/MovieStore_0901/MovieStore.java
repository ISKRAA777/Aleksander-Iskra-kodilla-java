package com.kodilla.good.patterns.challenges.MovieStore_0901;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStore {
    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);
        return booksTitlesWithTranslations;
    }

    //wykonaj iterację po poniższej mapie tytułów i wyświetl wszystkie tytuły w jednym ciągu
    // separując je wykrzyknikiem:
    public void steam1(Map<String, List<String>> movies) {
        movies.values().stream().forEach(title -> System.out.print(title.toString() + "!"));
    }

    public void steam2(Map<String, List<String>> movies) {
        System.out.println(movies.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining(" ! ", "All titles: ", ".")));
    }

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.steam1(movieStore.getMovies());
        System.out.println("------------");
        movieStore.steam2(movieStore.getMovies());

    }
}