package Observer.News;

import java.util.Observable;
import java.util.Observer;
public class SecondNewsReader implements Observer {
    public void update(Observable obj, Object arg) {
        System.out.println("SecondNewsReader got The news:"+(String)arg);
    }
}
