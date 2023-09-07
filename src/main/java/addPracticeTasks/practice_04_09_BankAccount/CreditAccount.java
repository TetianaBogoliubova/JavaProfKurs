package addPracticeTasks.practice_04_09_BankAccount;

public class CreditAccount extends Account implements Transferable {
    private double creditLimit;

    public CreditAccount(String destination, double balance, double creditLimit) {
        super(destination, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void transfer(Account destination, double amount) {

        double x;
        x = getBalance() - amount;
        if (x < 0) {
            setBalance(x + creditLimit);
        }
    }
}

