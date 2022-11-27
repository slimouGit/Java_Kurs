package Exception.Example.Auftrag;

import java.util.ArrayList;

public class AuftragHandler {
    ArrayList<String> waren = new ArrayList<String>() {
        {
            add("Computer");
            add("Festplatte");
        }
    };
    ArrayList<String> lieferanten = new ArrayList<String>() {
        {
            add("Laden");
            add("Geschäft");
        }
    };
    public String findByWare(String ware){
        return waren.stream()
                .filter(w -> w.equals(ware))
                .findAny()
                .orElse(null);
    }
    public String findByLieferant(String lieferant){
        return lieferanten.stream()
                .filter(l -> l.equals(lieferant))
                .findAny()
                .orElse(null);
    }
}
