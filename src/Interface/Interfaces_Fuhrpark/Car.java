package Interfaces_Fuhrpark;

/**
 * Created by salim on 06.03.2019.
 */
public class Car implements MoveCar {
    private String model;
    private int horsePower;
    private int xPosition;
    private int yPosition;

    public Car(String model, int horsePower, int xPosition, int yPosition) {
        this.model = model;
        this.horsePower = horsePower;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
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

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    @Override
    public void driveCar(int x, int y) {
        this.xPosition+=x;
        this.yPosition+=y;
    }

    @Override
    public void printPosition() {
        System.out.println("Position von " + this.model + " ist: x: " + this.xPosition + " y: " + this.yPosition);
    }
}
