package VarArgs;

/**
 * User: salim
 * Date: 15.06.2019 07:33
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Max");
        Person p2 = new Person("Maria");
        Person p3 = new Person("Tanja");
        Person p4 = new Person("Karl");
        Person p5 = new Person("Peter");

        showTeam("Die Bomber", p1, p4, p2);
        showTeam("Die Dosenknacker", p3, p5);
        showTeam("1. FC Krümel", p2, p1, p4, p3, p5);
    }

    private static void showTeam(String className, Person... p) {
        System.out.println("\n" + className + " with " + p.length + " members");
        for (Person item : p) {
            System.out.println("name: " + item.getName());
        }
    }

    ;
}
