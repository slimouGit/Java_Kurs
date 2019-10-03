package Recursion.Situps;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SitupsTest {

    @Test
    public void testBodyBuildersFitnessFalse(){
        int fitness = 10;
        int amount = 6;

        Bodybuilder testBb = new Bodybuilder(fitness);
        Situps su = new Situps(amount, testBb);

        su.makeSitups(su.amount);

        boolean result = su.isWin();

        Assertions.assertFalse(result);
    }

    @Test
    public void testBodyBuildersFitnessSuccess(){
        int fitness = 10;
        int amount = 2;

        Bodybuilder testBb = new Bodybuilder(fitness);

        Situps su = new Situps(amount, testBb);
        su.makeSitups(su.amount);

        boolean result = su.isWin();

        Assertions.assertTrue(result);
    }
}
