package src5;

public class BankAccount {
    private String owner;
    private int balance;

    // BankAccount 메소드 정의. 매개변수로 사용자, 잔액
    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    //사용자 반환하는 메소드
    public String getOwner() {
        return owner;
    }

    // 잔액 반환하는 메소드
    public int getBalance() {
        return balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원이 입금 완료");
    }

    public void deposit(int amount, String message) {
        balance += amount;
        System.out.println(message + " 메모와 함께 " + amount + "원 입금 완료");
    }

    public void showInfo() {
        System.out.println("예금주: " + owner + ", 잔액: " + balance);
    }
}