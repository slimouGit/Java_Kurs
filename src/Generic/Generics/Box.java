package Generics;

/**
 * Created by salim on 24.03.2019.
 */
public class Box<T> {

    private T objectInBox;

    public Box(T objectInBox){
        this.objectInBox = objectInBox;
    }

    public T getObjectInBox(){
        return this.objectInBox;
    }

}
