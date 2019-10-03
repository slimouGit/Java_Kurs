package Recursion.Situps;

public class Situps {
    int amount;
    Bodybuilder bb;
    private boolean win;

    public Situps(int amount, Bodybuilder bb) {
        this.amount = amount;
        this.bb = bb;
    }

    public static void main(String[] args) {
        Situps su = new Situps(6, new Bodybuilder(10));
        su.makeSitups(su.amount);
    }

    void makeSitups(int situp) {
        int repeat = amount;
        if (situp > 0) {
            repeat = manageRepeat(situp, repeat);
            if ((repeat * 2) > bb.getFitness()) {
                this.win = false;
                System.out.println("Isch kann ned mehr! "+isWin());
            } else {
                System.out.println("Situp Nr. " + repeat);
                situp--;
                makeSitups(situp);
            }
        } else {
            this.win = true;
            System.out.println("READY!!! "+isWin());
        }
    }

    private int manageRepeat(int situp, int repeat) {
        repeat -= situp;
        repeat++;
        return repeat;
    }

    public int getAmount() {
        return amount;
    }

    public Bodybuilder getBb() {
        return bb;
    }

    public boolean isWin() {
        return win;
    }
}
