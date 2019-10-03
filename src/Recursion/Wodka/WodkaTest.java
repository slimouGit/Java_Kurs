package Recursion.Wodka;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WodkaTest {

    @Test
    public void senselessDrinkWodkaTest(){
        int testWodka = 5;
        Wodka w = new Wodka(5);
        w.drinkWodka(testWodka);
        assertEquals(testWodka,w.getW());
    }
}
