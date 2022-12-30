package Recursion.Situps;


import org.testng.annotations.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SitupChallengeTest {

    @Test
    public void testBodyBuildersFitnessFalse(){
        int roundsToSurvive = 6;
        int bodybuilderFitness = 10;

        BodyBuilder testBb = new BodyBuilder(bodybuilderFitness);
        SitupChallenge sc = new SitupChallenge(roundsToSurvive, testBb);

        sc.makeSitups(sc.roundsToSurvive, sc.bodybuilder);

        boolean result = sc.isChallengeWon();

        assertFalse(result);
    }

    @Test
    public void testBodyBuildersFitnessSuccess(){
        int roundsToSurvive = 2;
        int bodybuilderFitness = 10;

        BodyBuilder testBb = new BodyBuilder(bodybuilderFitness);

        SitupChallenge su = new SitupChallenge(roundsToSurvive, testBb);
        su.makeSitups(su.roundsToSurvive, su.bodybuilder);

        boolean result = su.isChallengeWon();

        assertTrue(result);
    }
}
