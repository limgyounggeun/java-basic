package acess.b;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0;
    }
    //public 메서드 deposit
    public void deposit(int amount) {
        if(isAmountValid(amount)){
            balance += amount;
            getBalance();
        }else{
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    //public 메서드 withdraw
    public void withdraw(int amount) {
        if(isAmountValid(amount) && balance >= amount){
            balance -= amount;
            getBalance();
        }else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메서드 getBalance
    public void getBalance() {
        System.out.println("현재 잔액은 " + balance +"원 입니다.");
    }

    //deposit()검증 메서드
    private boolean isAmountValid(int amount) {
        //금액이 0보다 커야합니다.
        return amount > 0;
    }
}
