package Composition.Werkzeugkoffer.NutzungsweiseWerkzeuge;

public interface Klopfbar {
    default void klopfbar(){
        System.out.print("Das Werkzeug " + this + " ist klopfbar\n");
    }
}
