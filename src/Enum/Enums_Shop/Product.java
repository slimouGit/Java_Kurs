package Enums_Shop;



/**
 * Created by salim on 17.03.2019.
 */
public abstract class Product {
    private String name;
    private double price;
    private Currency currency;

    public Product(double price, Currency currency) {
        this.price = price;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void buyProduct(){
        System.out.print("Das Produkt " + name + " wurde erfolgreich für " + price + " " + currency + " gekauft");
    }
}
