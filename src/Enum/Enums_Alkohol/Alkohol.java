package Enums_Alkohol;

import java.text.DecimalFormat;

/**
 * Created by salim on 17.03.2019.
 */
public enum Alkohol {
    WEIN( 12 ), BIER( 4.5 ), BANANE( 1 ), WASSER( 0 );

    private final double alkoholgehaltProzent;

    // Konstruktor mit Parameteruebergabe:
    Alkohol( double alkoholgehaltProzent ) { this.alkoholgehaltProzent = alkoholgehaltProzent; }

    public double alkoholgehalt() { return alkoholgehaltProzent; }

    // Gemeinsame Berechnungsmethode fuer alle Enumerationskonstanten:
    public String abbauzeit( double getraenkMenge, double koerpergewicht ) {
        double mengeAlkoholKg = getraenkMenge * alkoholgehaltProzent / 100;
        double abbauzeit = 9090.9 * mengeAlkoholKg / koerpergewicht; // 0,11g / (kg * h)
        return "Alkoholabbau dauert " + (new DecimalFormat( "0.0" )).format( abbauzeit ) + " h bei " +
                getraenkMenge + " Liter " + toString() + " bei " + koerpergewicht + " kg Koerpergewicht";
    }
}
