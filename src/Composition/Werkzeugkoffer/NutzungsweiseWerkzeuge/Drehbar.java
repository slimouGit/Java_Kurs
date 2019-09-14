package Composition.Werkzeugkoffer.NutzungsweiseWerkzeuge;

public interface Drehbar {
    default void drehbar(){
        System.out.print("Das Werkzeug " + this + " ist drehbar\n");
    }
}
