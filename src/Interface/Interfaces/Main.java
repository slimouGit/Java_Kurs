package Interface.Interfaces;

import Interfaces.Fruit;

/**
 * Created by salim on 06.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes", 255, 68.000);
        Fruit apple = new Fruit("Apfel", 20, 1.05);
        mercedes.buyProduct();
        apple.buyProduct();

        Buyable[] testArr = new Buyable[2];
        testArr[0] = mercedes;
        testArr[1] = apple;

        System.out.println("Konstante " + Buyable.x);
    }
}
