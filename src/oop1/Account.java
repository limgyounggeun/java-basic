package oop1;

public class Account {
    int balance; //잔액

    //입금 메서드
    void deposit(int amount) {
        balance += amount;
        System.out.println("잔액은 : " + balance + "원 입니다.");
    }
    //출금 메서드
    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
        }else{
            balance -= amount;
            System.out.println("잔액은 : " + balance + "원 입니다.");
        }
    }
}
