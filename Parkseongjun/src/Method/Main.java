package Method;
class BankAccount {
    String owner;
    int balance;

    BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원이 입금 완료");
    }

    void deposit(int amount, String message) {
        balance += amount;
        System.out.println(message + " 메모와 함께 " + amount + "원 입금 완료");
    }
}


public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("홍길동", 10000);

        account.deposit(5000);
        System.out.println("예금주: " + account.owner + " / 잔액: " + account.balance);

        account.deposit(5000, "메모예시");
        System.out.println("예금주: " + account.owner + " / 잔액: " + account.balance);
    }
}


