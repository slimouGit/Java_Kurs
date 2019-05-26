package Vererbung_Company;

/**
 * Created by salim on 05.03.2019.
 */
public class Main {
    public static void main(String[] args) {

        Manager manager1 = new Manager("Stefanie", "Brockhaus", 12558787, 0);
        Manager manager2 = new Manager("Hans", "Wellenstein", 12558741, 2);
        Assistant assistant1 = new Assistant("Sascha", "Zander", 85546, 40, 12558741);
        Assistant assistant2 = new Assistant("Tanja", "Bartocha", 25447, 40, 12558741);

        assistant1.isManagerBy(manager1);

    }
}
