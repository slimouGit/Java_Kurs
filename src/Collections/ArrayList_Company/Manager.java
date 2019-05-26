package Collections.ArrayList_Company;

import java.util.List;

/**
 * Created by salim on 24.03.2019.
 */
public class Manager<T> {
    
    private T object;

    public Manager(T object){
        this.object = object;
    }

    public T object(){
        return this.object;
    }

    public <T> void printObject(T obj){
        System.out.println("generic object " + obj.toString());
    }

}
