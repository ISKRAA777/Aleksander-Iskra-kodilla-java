package com.kodilla.patterns.Builder_11_5;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmack() {

        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll(RollType.STANDARD)
                .burgers(2)
                .souse(SouseType.HOT)
                .ingredientsTypes(IngredientsType.CHEESE)
                .ingredientsTypes(IngredientsType.CHILI_PEPPERS)
                .ingredientsTypes(IngredientsType.LETTUCE).build();

        //when
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredientsTypes().size();

        //then
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertTrue(bigmac.getIngredientsTypes().contains(IngredientsType.CHILI_PEPPERS));
        Assert.assertFalse(bigmac.getIngredientsTypes().contains(IngredientsType.BACON));
    }


}




