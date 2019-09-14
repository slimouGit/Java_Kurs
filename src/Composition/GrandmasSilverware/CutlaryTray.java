package Composition.GrandmasSilverware;

import Composition.GrandmasSilverware.Cutlary.Fork;
import Composition.GrandmasSilverware.Cutlary.Knife;
import Composition.GrandmasSilverware.Cutlary.Spoon;

public class CutlaryTray {
    private Spoon spoon;
    private Knife knife;
    private Fork fork;

    public CutlaryTray(){
        this.spoon = new Spoon();
        this.knife = new Knife();
        this.fork = new Fork();
    }

    public static void main(String[] args){
        CutlaryTray ct = new CutlaryTray();
        ct.spoon.spoonSoup();
        ct.fork.forkLunch();
        ct.knife.cutLunch();
    }
}
