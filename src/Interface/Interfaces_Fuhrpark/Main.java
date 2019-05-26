package Interfaces_Fuhrpark;

/**
 * Created by salim on 06.03.2019.
 */
public class Main {
    public static void main(String[] args){
        Tesla modelS = new Tesla("Model S", 210, 0, 0);
        Audi a6 = new Audi("A6", 280, 0, 0);

        modelS.printPosition();
        modelS.driveCar(50,50);
        modelS.printPosition();

        a6.printPosition();
        a6.driveCar(150,50);
        a6.printPosition();

        MoveCar[] carArr = new MoveCar[2];
        carArr[0]= modelS;
        carArr[1]= a6;

//        carArr[1].printPosition();

        for(int i = 0; i<carArr.length;i++){
            carArr[i].driveCar(100,50);
            carArr[i].printPosition();
        }
    }
}
