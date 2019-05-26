package Exception.HeaterException;

import java.util.Scanner;

/**
 * Created by salim on 13.04.2019.
 */
public class Heater {
    private int level;

    public Heater(int level) {
        this.level = level;
    }

    public void regulateHeater() throws HeaterException {
        System.out.println("Aktuelle Stufe " + this.level);
        System.out.println("Stufe eintragen:");
        Scanner scanner = new Scanner(System.in);

        this.level = scanner.nextInt();

        if (this.level < 0 || this.level > 5) {
            throw new HeaterException("Die Heizung ist explodiert und nicht mehr zu gebrauchen");
        }
        if (this.level == 00) {
            System.out.println("Die Heizung ist ausgeschaltet");
        } else {
            regulateHeater();
        }
    }
}
