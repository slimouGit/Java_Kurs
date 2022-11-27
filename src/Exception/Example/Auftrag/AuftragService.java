package Exception.Example.Auftrag;

import java.util.HashMap;
import java.util.Map;

public class AuftragService {
    public Auftrag ladeAuftrag(String ware, String lieferant) {
        String wareResult = "";
        String lieferantResult = "";
        try {
            wareResult = this.findByWare(ware);
            lieferantResult = this.findByLieferant(lieferant);
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        return new Auftrag(wareResult, lieferantResult);

    }
    public String findByWare(String ware) {
        AuftragHandler auftragHandler = new AuftragHandler();
        String wareResult = auftragHandler.findByWare(ware);
        if(null == wareResult){
            throw new RuntimeException("keine Ware gefunden");
        }
        return wareResult;
    }
    public String findByLieferant(String lieferant) {
        AuftragHandler auftragHandler = new AuftragHandler();
        String lieferantResult = auftragHandler.findByLieferant(lieferant);
        if(null == lieferantResult){
            throw new RuntimeException("keinen Lieferanten gefunden");
        }
        return lieferantResult;
    }



}
