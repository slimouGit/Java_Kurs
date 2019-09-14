package Composition.Werkzeugkoffer.Werkzeug;

import Composition.Werkzeugkoffer.NutzungsweiseWerkzeuge.Klopfbar;

public class Hammer extends Werkzeug implements Klopfbar {
    public Hammer(String typ) {
        super(typ);
    }


}
