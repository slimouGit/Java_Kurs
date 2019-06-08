package Interface.Interfaces;

/**
 * Created by salim on 06.03.2019.
 */
public class Car implements Buyable {
    private String model;
    private int horsePower;
    private double price;

    public Car(String model, int horsePower, double price) {
        this.model = model;
        this.horsePower = horsePower;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void buyProduct() {
        System.out.println("Preis: " + this.price);
        System.out.println("Produkt erfolgreich gekauft");
    }
}
