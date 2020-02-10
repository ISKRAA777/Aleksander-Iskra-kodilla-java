package world_0704;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final List<Country> countryList = new ArrayList<>();
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public String getContinentName() {
        return continentName;
    }

    public boolean addCountry(Country country) {
        return countryList.add(country);
    }
}
