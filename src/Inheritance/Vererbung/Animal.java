package Vererbung;

/**
 * Created by salim on 05.03.2019.
 */
public class Animal {
    private String name;
    private int age;
    private String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move(){
        System.out.println(getName() + " moves with 10 km/h");
    }

   public void sleep(){
        System.out.println(this.name + " is sleeping");
    }
}
