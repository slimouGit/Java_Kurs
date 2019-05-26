package Enums;

/**
 * Created by salim on 17.03.2019.
 */
public class Main {
    public static void main(String[] args){

        Weekday weekday;
        weekday = Weekday.FRIDAY;

        switch (weekday){
            case MONDAY: System.out.println("Montag");break;
            case TUESDAY: System.out.println("Dienstag");break;
            case WEDNESDAY: System.out.println("Mittwoch");break;
            case THURSDAY: System.out.println("Donnerstag");break;
            case FRIDAY: System.out.println("Freitag");break;
            case SATURDAY: System.out.println("Samstag");break;
            case SUNDAY: System.out.println("Sonntag");break;
            default: System.out.println("ungültiger Wochentag");
        }

    }
}
