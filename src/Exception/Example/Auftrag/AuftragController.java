package Exception.Example.Auftrag;

import java.util.Map;

public class AuftragController {
    public static void main(String[] args) {
        AuftragService auftragService = new AuftragService();
        Auftrag auftrag = auftragService.ladeAuftrag("Computer", "Laden");
        System.out.println("Ware: " + auftrag.getWare() + " Lieferant: " + auftrag.getLieferant());
    }
}
