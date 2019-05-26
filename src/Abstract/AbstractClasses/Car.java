package Abstract.AbstractClasses;

/**
 * Created by salim on 07.03.2019.
 */
public abstract class Car implements AbstractClasses.Drivaeable {

    private int horsePower;

    public void driveCar(){
        System.out.print("Das Auto fährt");
    }

    public abstract void openDoor();
}
