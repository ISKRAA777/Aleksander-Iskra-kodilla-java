package world_0704;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //given
        World world = new World();
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent austrslia = new Continent("Australia");
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(austrslia);

        Country england = new Country("England", new BigDecimal("66763000"));
        Country germany = new Country("Germany", new BigDecimal("82079000"));
        Country russia = new Country("Russia", new BigDecimal("144500000"));
        Country japan = new Country("Japan", new BigDecimal("126500000"));
        Country australia = new Country("Australia", new BigDecimal("24600000"));
        Country newZealand = new Country("NewZealand", new BigDecimal("4700000"));

        europe.addCountry(england);
        europe.addCountry(germany);
        asia.addCountry(russia);
        asia.addCountry(japan);
        austrslia.addCountry(australia);
        austrslia.addCountry(newZealand);

        //when
        BigDecimal quantity = world.getPeopleQuantity();

        //then
        Assert.assertEquals(new BigDecimal(449142000),quantity);
    }


}