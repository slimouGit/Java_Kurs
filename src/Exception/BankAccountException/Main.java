package Exception.BankAccountException;

/**
 * Created by salim on 06.04.2019.
 */
public class Main {
    public static void main(String[] args){
        Bank b1 = new Bank(56000);

        try {
            b1.withdraw(56000);
        } catch (LessCreditException e) {
            System.out.println(e.getMessage());
        } catch (LessWithdrawException e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Danke für Ihren Besuch, Ihr aktuelles Guthaben beträgt " + b1.getBallance() + " Euro");
        }

    }
}
