package Interfaces;

/**
 * Created by salim on 06.03.2019.
 */
public class Fruit extends Interfaces.SupermarketProducts implements Interfaces.Buyable, Interfaces.Transportable {
    private String name;
    private int weight;
    private double price;

    public Fruit(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void buyProduct() {
        System.out.println("Preis: " + this.price);
        System.out.println("Produkt erfolgreich gekauft");
    }

    @Override
    public void transportProduct() {
        System.out.println("Produkt wird transportiert");

    }
}
