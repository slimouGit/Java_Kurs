package VarArgs;

class TeamBuilding{
    void showTeam(String className, Person... p) {
        System.out.println("\n" + className + " with " + p.length + " members");
        for (Person item : p) {
            System.out.println("name: " + item.getName());
        }
    };
}
