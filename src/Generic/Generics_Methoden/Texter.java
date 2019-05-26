package Generics_Methoden;

/**
 * Created by salim on 24.03.2019.
 */
public class Texter {

    public <T> void printObject(T obj){
        System.out.println(obj.toString());
    }
}
