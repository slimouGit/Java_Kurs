package OOP.Firma;

import java.util.List;

public class Abteilung {

    private String bezeichnung;
    private List<Angestellter> angestellte;

    public Abteilung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Abteilung(String bezeichnung, List<Angestellter> angestellte) {
        this.bezeichnung = bezeichnung;
        this.angestellte = angestellte;
    }

     public List<Angestellter> getAngestellte() {
        return angestellte;
    }

    public void setAngestellte(List<Angestellter> angestellte) {
        this.angestellte = angestellte;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}
