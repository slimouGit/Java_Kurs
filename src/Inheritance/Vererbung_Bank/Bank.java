package Vererbung_Bank;

/**
 * Created by salim on 05.03.2019.
 */
public class Bank {

    private String name;
    private long kreditlimit;

    public Bank(String name, long kreditlimit) {
        this.name = name;
        this.kreditlimit = kreditlimit;
    }

    public Bank() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getKreditlimit() {
        return kreditlimit;
    }

    public void setKreditlimit(long kreditlimit) {
        this.kreditlimit = kreditlimit;
    }


    public void openBankaccount(Person p, Bank b){
        System.out.println("Hallo " + p.getVorname() + " " + p.getNachname());
        System.out.println("Sie haben Ihr Konto erfolgreich eröffnet:\n");
        System.out.println("Name der Bank:\t " + b.getName());
        System.out.println("Ihr Kontostand:\t " + p.getGuthaben());
        System.out.println("Kreditlimit:\t " + b.getKreditlimit());
        System.out.println("************************************************************\n");

    }

    public void openBankaccount(Person p){
        System.out.println("Hallo " + p.getVorname() + " " + p.getNachname());
        System.out.println("Sie haben Ihr Konto erfolgreich eröffnet:\n");
        System.out.println("Name der Bank:\t " + this.getName());
        System.out.println("Ihr Kontostand:\t " + p.getGuthaben());
        System.out.println("Kreditlimit:\t " + this.getKreditlimit());
        System.out.println("************************************************************\n");

    }
}
