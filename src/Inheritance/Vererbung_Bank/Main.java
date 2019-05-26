package Vererbung_Bank;


import Vererbung.KfW;
import Vererbung.UniCredit;

public class Main {

    public static void main(String[] args) {

        DeutscheBank db = new DeutscheBank("Deutsche Bank", 20000);
        CommerzBank combank = new CommerzBank("Commerz Bank", 15000);
        KfW kfw = new KfW("KfW", 50000);
        UniCredit uc = new UniCredit("UniCredit", 40000);

        Person person1 = new Person("Hans", "Zimmer", 1000);
        Person person2 = new Person("Salim", "Oussayfi", 25000);
        Person person3 = new Person("Mimi", "Illmi", 150000);

        db.openBankaccount(person1);
        combank.openBankaccount(person2);
        uc.openBankaccount(person3);
        kfw.openBankaccount(person3);



    }
}
