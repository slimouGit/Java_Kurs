package Clone.Clone_Method_flacheKopie.Clone_CopyConstructor;

/**
 * Created by salim on 07.04.2019.
 */
public class Main {
    public static void main(String[] args){
        CarEngine engine = new CarEngine("Elektro");
        Car car1 = new Car("Mercedes", 250, engine);
//        Car car2 = car1.clone();
        Car car2 = new Car(car1);


        System.out.println(car1);
        System.out.println(car2);

        System.out.println("\n\nManipulate Car\n");

        car2.setBrand("Porsche");
        car2.setHorsePower(300);
        car2.getEngine().setEngineName("Diesel 1.7"); //Fehler bei flacher Kopie, clone erzeugt nur Clone von oberster Ebene

        System.out.println(car1);
        System.out.println(car2);




    }

}
