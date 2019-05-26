package Equal.Equals_Hashmap_Danceschool;

import java.util.*;

/**
 * Created by salim on 20.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        Dancer tina = new Dancer("Tina");
        Dancer peter = new Dancer("Peter");
        Dancer patrick = new Dancer("Patrick");
        Dancer sonja = new Dancer("Sonja");
        Dancer tanja = new Dancer("Tanja");
        Dancer simon = new Dancer("Simon");
        Dancer britta = new Dancer("Britta");
        Dancer thomas = new Dancer("Thomas");
        Dancer maike = new Dancer("Maike");
        Dancer michael = new Dancer("Michael");
        Map<Dancer, Dancer> danceCouples = new HashMap<>();

        danceCouples.put(tina, peter);
        danceCouples.put(patrick, sonja);
        danceCouples.put(sonja, sonja);
        danceCouples.put(peter, tina);
        danceCouples.put(tanja, michael);
        danceCouples.put(michael, tanja);
        danceCouples.put(thomas, maike);
        danceCouples.put(thomas, thomas);
        danceCouples.put(britta, michael);
        danceCouples.put(michael, maike);
        danceCouples.put(simon, maike);
        danceCouples.put(tanja, thomas);
        danceCouples.put(peter, sonja);

        List<String> danceCouplesAsList = new ArrayList<>();
        Iterator itr = danceCouples.entrySet().iterator();

        System.out.println("Mögliche Formationen:");

        while (itr.hasNext()) {
            Map.Entry dancer = (Map.Entry) itr.next();
            if (dancer.getKey().equals(dancer.getValue())) {
                System.out.println(dancer.getKey() + " und " + dancer.getValue());
                //verhindern der Kombinationen AB und BA
                if (!danceCouplesAsList.contains(dancer.getValue() + " und " + dancer.getKey())) {
                    //verhindern, dass ein Taenzer mehrmals auftritt
                    if (!(danceCouplesAsList.toString().indexOf(dancer.getValue().toString()) != -1 ||
                            danceCouplesAsList.toString().indexOf(dancer.getKey().toString()) != -1)) {
                        danceCouplesAsList.add(dancer.getKey() + " und " + dancer.getValue());
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Ausgwählte Formationen:");

        for (String choosenCouple : danceCouplesAsList) {
            System.out.println(choosenCouple);
        }


    }
}
