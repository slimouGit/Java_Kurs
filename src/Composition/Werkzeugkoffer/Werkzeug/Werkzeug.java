package Composition.Werkzeugkoffer.Werkzeug;

public class Werkzeug {
    private String typ;

    public Werkzeug(String typ) {
        this.typ = typ;
    }

    public String getTyp() {
        return typ;
    }

    @Override
    public String toString(){
        return this.getTyp();
    }

}
