package com.kodilla.patterns.Builder_11_5;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final RollType roll;
    private final int burgers;
    private final SouseType souse;
    private List<IngredientsType> ingredientsTypes;

    public Bigmac(RollType roll, int burgers, SouseType souse, List<IngredientsType> ingredientsTypes) {
        this.roll = roll;
        this.burgers = burgers;
        this.souse = souse;
        this.ingredientsTypes = ingredientsTypes;

    }

    public RollType getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public SouseType getSouse() {
        return souse;
    }

    public List<IngredientsType> getIngredientsTypes() {
        return ingredientsTypes;
    }

    public static class BigmacBuilder { //klasa wewnętrzna Builder
        private RollType roll;
        private int burgers;
        private SouseType souse;
        private List<IngredientsType> ingredientsTypes = new ArrayList<>();

        public BigmacBuilder roll(RollType roll) {
            this.roll = roll;
            return this;

        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;

        }

        public BigmacBuilder souse(SouseType souse) {
            this.souse = souse;
            return this;
        }

        public BigmacBuilder ingredientsTypes(IngredientsType ingredients) {
            ingredientsTypes.add(ingredients);
            return this;
        }
        public Bigmac build (){
            return new Bigmac(roll, burgers, souse, ingredientsTypes);
        }
    }
}