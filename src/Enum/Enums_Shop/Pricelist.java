package Enums_Shop;

/**
 * Created by salim on 17.03.2019.
 */
public enum Pricelist {
    MILK(0.65), WATER(0.30), JUICE(1.98);

    private final double price;

    Pricelist(double price) {
        this.price = price;
    }

    public double ermittelPreis(){
        return price;
    }
}
