package Vererbung_Bank;

/**
 * Created by salim on 05.03.2019.
 */
public class Person {
    private String vorname;
    private String nachname;
    private long guthaben;

    public Person(String vorname, String nachname, long guthaben) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.guthaben = guthaben;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public long getGuthaben() {
        return guthaben;
    }

    public void setGuthaben(long guthaben) {
        this.guthaben = guthaben;
    }
}
