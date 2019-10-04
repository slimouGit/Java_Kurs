package Recursion.Situps;

public class SitupChallenge {
    int roundsToSurvive;
    BodyBuilder bodybuilder;
    private boolean challengeWon;

    public SitupChallenge(int roundsToSurvive, BodyBuilder bodybuilder) {
        this.roundsToSurvive = roundsToSurvive;
        this.bodybuilder = bodybuilder;
        System.out.println("CHALLENGE STARTS\n" + "rounds to survive:\t\t" + roundsToSurvive + "\nbodybuilders fitness\t"+bodybuilder.fitness);
    }

    public static void main(String[] args) {
        int roundsToSurvive = 5;
        int bodybuilderFitness = 12;
        SitupChallenge sc = new SitupChallenge(roundsToSurvive, new BodyBuilder(bodybuilderFitness));
        sc.makeSitups(sc.roundsToSurvive, sc.bodybuilder);
    }

    /**
     *  Situp Challenge
     *  nimmt Anzahl der zu überstehenden Runden und die Fitness des Bodybuilders an
     */
    void makeSitups(int roundsToSurvive, BodyBuilder bodybuilder) {
        int amountOfRoundsToSurvive = this.roundsToSurvive;
        if (roundsToSurvive > 0) {
            amountOfRoundsToSurvive = manageRepeat(roundsToSurvive, amountOfRoundsToSurvive);
            if (manageFitness(bodybuilder, amountOfRoundsToSurvive)) {
                System.out.println("Isch kann ned mehr!");
                this.challengeWon = false;
            } else {
                System.out.println("Situp Nr. " + amountOfRoundsToSurvive);
                roundsToSurvive--;
                makeSitups(roundsToSurvive, bodybuilder);
            }
        } else {
            System.out.println("Isch habs geschaffd");
            this.challengeWon = true;
        }
    }

    /**
     * Anzahl der bereits getaetigten Situps
     */
    private int manageRepeat(int situp, int roundsToSurvive) {
        roundsToSurvive -= situp;
        roundsToSurvive++;
        return roundsToSurvive;
    }

    /*
     * Formel, um die Ausdauer des BodyBuilders zu berechnen
     */
    private boolean manageFitness(BodyBuilder bodybuilder, int roundsToSurvive) {
        return (roundsToSurvive * 2) > bodybuilder.getFitness();
    }

    public boolean isChallengeWon() {
        return challengeWon;
    }
}
