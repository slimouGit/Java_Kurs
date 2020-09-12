package OOP.Firma;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Angestellter max = new Angestellter("Max", "Mustermann", 42);
        Angestellter maria = new Angestellter("Maria", "Musterfrau", 26);
        Angestellter tim = new Angestellter("Tim", "Müller", 30);

        Abteilung elektro = new Abteilung("Elektro", new ArrayList<>(Arrays.asList(maria, max)));
        Abteilung kueche = new Abteilung("Küche");

        Kaufhaus kaufgut = new Kaufhaus(new ArrayList<>(Arrays.asList(elektro,kueche)));

        kueche.setAngestellte(new ArrayList<>(Arrays.asList(tim)));

        kaufgut.getAbteilungen().forEach(abteilung ->
                abteilung.getAngestellte().forEach(angestellter ->
                        System.out.println(angestellter.getNachname() + " " + abteilung.getBezeichnung())));



    }
}
