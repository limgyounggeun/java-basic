package acess.b;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(100);
        bankAccount.withdraw(100);
        bankAccount.deposit(200);
        bankAccount.withdraw(400);
        bankAccount.getBalance();

    }
}
