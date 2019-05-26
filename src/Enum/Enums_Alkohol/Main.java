package Enums_Alkohol;



/**
 * Created by salim on 17.03.2019.
 */
public class Main {
    public static void main(String[] args){

        System.out.println( "Alkoholgehalt von Bananen: " + Alkohol.BANANE.alkoholgehalt() + " %" );
        System.out.println( Alkohol.BIER.abbauzeit( 0.5, 80 ) );
        System.out.println( Alkohol.WEIN.abbauzeit( 0.2, 70 ) );

    }
}
