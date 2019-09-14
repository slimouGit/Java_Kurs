package Composition.Werkzeugkoffer;

import Composition.Werkzeugkoffer.Werkzeug.Hammer;
import Composition.Werkzeugkoffer.Werkzeug.Schraubendreher;
import Composition.Werkzeugkoffer.Werkzeug.Totenkopf;
import Composition.Werkzeugkoffer.Werkzeug.Zange;

public class Werkzeugkoffer {

    private Totenkopf totenkopf;
    private Zange zange;
    private Hammer hammer;
    private Schraubendreher schraubendreher;

    Werkzeugkoffer(){
        this.schraubendreher = new Schraubendreher("Schraubendreher");
        this.hammer = new Hammer("Hammer");
        this.zange = new Zange("Zange");
        this.totenkopf = new Totenkopf();
    }

    public static void main(String[] args){
        Werkzeugkoffer werkzeugkoffer = new Werkzeugkoffer();

        werkzeugkoffer.schraubendreher.drehbar();
        werkzeugkoffer.hammer.klopfbar();
        werkzeugkoffer.zange.drehbar();
        werkzeugkoffer.zange.ziehbar();

        werkzeugkoffer.totenkopf.drehbar();
    }
}
