package Recursion.Wodka;

public class Wodka {
    private int w;

    public Wodka(int w) {
        this.w = w;
    }

    public static void main(String[] args) {
        Wodka wodka = new Wodka(5);
        wodka.drinkWodka(wodka.w);
    }

    public void drinkWodka(int wodka) {
        int count = w;
        if (wodka > 0) {
            count = manageCounter(wodka, count);
            System.out.println("Wodka Nr. " + count);
            wodka -= 1;
            drinkWodka(wodka);
        } else {
            System.out.println("Need more wodka, NOW!");
        }
    }

    private int manageCounter(int wodka, int count) {
        count -= wodka;
        count++;
        return count;
    }

    public int getW() {
        return w;
    }
}
