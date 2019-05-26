package Exception.BankAccountException;

/**
 * Created by salim on 06.04.2019.
 */
public class Bank {
    private int ballance;

    public Bank(int ballance) {
        this.ballance = ballance;
    }

    public int getBallance() {
        return ballance;
    }

    public void withdraw(int amount) throws LessCreditException, LessWithdrawException {
        if (amount < 10) {
            throw new LessWithdrawException("Der Betrag von " + amount + " Euro ist zu gering für eine Transaktion");
        }
        if (amount > this.ballance) {
            throw new LessCreditException("Der Betrag von " + amount + " Euro kann nicht abgehoben werden, weil das Guthaben zu gering ist");
        } else {
            this.ballance -= amount;
            System.out.println("Erfolgreiche Transaktion");
        }
    }
}
