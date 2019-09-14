package Composition.Werkzeugkoffer.Werkzeug;

import Composition.Werkzeugkoffer.NutzungsweiseWerkzeuge.Drehbar;
import Composition.Werkzeugkoffer.NutzungsweiseWerkzeuge.Ziehbar;

public class Zange extends Werkzeug implements Drehbar, Ziehbar {

    public Zange(String typ) {
        super(typ);
    }
}
