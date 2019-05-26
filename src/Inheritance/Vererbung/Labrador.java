package Vererbung;

/**
 * Created by salim on 05.03.2019.
 */
public class Labrador extends Dog {

    private String nickname;

    public Labrador(String name, int age, String color) {
        super(name, age, color);
    }

    public Labrador(String name, int age, String color, String nickname) {
        super(name, age, color);
        this.nickname = nickname;
    }

    public Labrador(String name, int age, String color, String nickname, boolean tail) {
        super(name, age, color, tail);
        this.nickname = nickname;
    }
}
