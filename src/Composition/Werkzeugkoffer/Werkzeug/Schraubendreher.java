package Composition.Werkzeugkoffer.Werkzeug;

import Composition.Werkzeugkoffer.NutzungsweiseWerkzeuge.Drehbar;

public class Schraubendreher extends Werkzeug implements Drehbar {
    public Schraubendreher(String typ) {
        super(typ);
    }
}
