package Enums_HappyEuro;

/**
 * Created by salim on 17.03.2019.
 */
public enum FixKosten {
    MIETE("Miete",800.00),
    STROM("Strom",65.00),
    INTERNET("Internet",39.95);

    private final String position;
    private final double amount;

    FixKosten(String position, double amount) {
        this.position = position;
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }

    public String getPosition(){
        return position;
    }
}
