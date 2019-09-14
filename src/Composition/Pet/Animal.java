package Composition.Pet;

public class Animal {

    private String name;
    private CleaningRoboter cleaningRoboter;

    Animal(){
        //every animal needs a cleaning roboter
        this.cleaningRoboter = new CleaningRoboter();
    }

    Animal(String name){
        this.name = name;
    }

    void pooping(Object t){
        System.out.println(t + " is pooping");
        cleaningRoboter.cleaningUp();
    }

    public String getName() {
        return name;
    }
}
