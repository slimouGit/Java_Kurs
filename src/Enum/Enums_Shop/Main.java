package Enums_Shop;

/**
 * Created by salim on 17.03.2019.
 */
public class Main {
    public static void main(String[] args){
        Pencil pencil = new Pencil(1.99, Currency.EURO, "Lamy");
        pencil.buyProduct();

        System.out.println("Milch " + Pricelist.MILK.ermittelPreis());
        System.out.println("Saft " + Pricelist.JUICE.ermittelPreis());
        System.out.println("Wasser " + Pricelist.WATER.ermittelPreis());
    }
}
