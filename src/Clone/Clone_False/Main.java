package Clone.Clone_False;

/**
 * Created by salim on 07.04.2019.
 */
public class Main {
    public static void main(String[] args){
        Car car1 = new Car("Mercedes", 250);
        Car car2;

        car2 = car1;

        System.out.println(car1);
        System.out.println(car2);

        car1.setBrand("Porsche");

        System.out.println(car1);
        System.out.println(car2);


        int var1 = 20;
        int var2 = var1;

        var2 = 40;
        System.out.println(var1);
        System.out.println(var2);


    }

}
