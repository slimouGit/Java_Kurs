package Enums_HappyEuro;

/**
 * Created by salim on 17.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        for (FixKosten f : FixKosten.values()) {
            System.out.println(f.getPosition() + ":\t" + f.getAmount() + " Euro");
        }
    }
}
