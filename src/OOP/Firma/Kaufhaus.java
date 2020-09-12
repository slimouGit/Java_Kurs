package OOP.Firma;

import java.util.List;

public class Kaufhaus {
    private List<Abteilung> abteilungen;

    public Kaufhaus(List<Abteilung> abteilungen) {
        this.abteilungen = abteilungen;
    }

    public List<Abteilung> getAbteilungen() {
        return abteilungen;
    }

    public void setAbteilungen(List<Abteilung> abteilungen) {
        this.abteilungen = abteilungen;
    }

}
