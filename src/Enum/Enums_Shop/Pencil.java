package Enums_Shop;

/**
 * Created by salim on 17.03.2019.
 */
public class Pencil extends Product {
    private String name;

    public Pencil(double price, Currency currency, String name) {
        super(price, currency);
        this.setName(name);
    }


}
