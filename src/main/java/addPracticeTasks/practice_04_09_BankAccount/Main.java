package addPracticeTasks.practice_04_09_BankAccount;

public class Main {
    public static void main(String[] args) {

        FixedBalanceAccount fixedAccount = new FixedBalanceAccount("123456", 1000);
        CreditAccount creditAccount = new CreditAccount("789012", -400, 1000);

        fixedAccount.transfer(creditAccount, 10000);
        creditAccount.transfer(fixedAccount, 300);

        System.out.println("Fixed account balance: " + fixedAccount.getBalance());
        System.out.println("Credit account balance: " + creditAccount.getBalance());
    }
}
