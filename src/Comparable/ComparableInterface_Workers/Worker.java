package Comparable.ComparableInterface_Workers;

/**
 * Created by salim on 23.03.2019.
 */
public class Worker implements Comparable {
    private int id;
    private String lastName;
    private String firstName;

    public Worker(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return "ID: " + this.id + " Name: " + this.firstName + " " + this.lastName;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Worker){
            Worker tmpWorker = (Worker) o;

            /**
             * Worker werden anhand des Nachnamen sortiert
             * Sind die Nachnamen identisch, werden sie anhand des Vornamens sortiert
             * Sind Nachname und Vorname identisch, wird anhand der ID sortiert
             */

            //vergleiche Nachnamen, falls gleich => Clone
            if(this.lastName.compareTo(tmpWorker.lastName) != 0){
                return this.lastName.compareTo(tmpWorker.lastName);
            }

            //vergleiche Vornamen, falls gleich => Clone
            if(this.firstName.compareTo(tmpWorker.firstName) != 0){
                return this.firstName.compareTo(tmpWorker.firstName);
            }

            if(this.id > tmpWorker.id){
                return 1;
            }

            if(this.id < tmpWorker.id){
                return -1;
            }
        }
        return 0;
    }
}
