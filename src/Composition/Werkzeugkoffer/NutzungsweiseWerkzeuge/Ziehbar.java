package Composition.Werkzeugkoffer.NutzungsweiseWerkzeuge;

public interface Ziehbar {
    default void ziehbar(){
        System.out.print("Das Werkzeug " + this + " ist ziehbar\n");
    }
}
