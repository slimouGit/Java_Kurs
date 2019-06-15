package VarArgs;


public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Max");
        Person p2 = new Person("Maria");
        Person p3 = new Person("Tanja");
        Person p4 = new Person("Karl");
        Person p5 = new Person("Peter");

        TeamBuilding tb = new TeamBuilding();

        tb.showTeam("Die Bomber", p1, p4, p2);
        tb.showTeam("Die Dosenknacker", p3, p5);
        tb.showTeam("1. FC Krümel", p2, p1, p4, p3, p5);
    }
}
