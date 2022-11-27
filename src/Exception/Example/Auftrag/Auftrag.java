package Exception.Example.Auftrag;

public class Auftrag {
    private String ware;
    private String lieferant;

    public Auftrag(String ware, String lieferant) {
        this.ware = ware;
        this.lieferant = lieferant;
    }
    public String getWare() {
        return ware;
    }

    public String getLieferant() {
        return lieferant;
    }
}
