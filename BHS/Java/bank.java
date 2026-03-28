import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


interface Chargeable {
    void applyFee();
}
class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String owner, int balance, double interestRate) {
        super(owner, balance);
        this.interestRate = interestRate;
    }

    public void AddInterest() {
        System.out.println("이자가 추가되었씁니다.");
    }


    @Override
    public void ShowInfo() {
        System.out.println("예금주: " + GetOwner() +
                ", 잔액: " + GetBalance() +
                ", 이자율: " + interestRate);
    }
}

class BankAccount implements Chargeable {
    private String owner;
    private int balance;

    BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String GetOwner() {
        return owner;
    }

    public int GetBalance() {
        return balance;
    }

    public void SetOwner(String owner) {
        this.owner = owner;
    }
    void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원이 입금되었습니다.");
    }

    void deposit(int amount, String message) {
        balance += amount;
        System.out.println(message + " 메모와 함께 " + amount + "원이 입금되었습니다.");
    }

    public void ShowInfo() {
        System.out.println("예금주: " + owner + ", 잔액: " + balance);
    }

    @Override
    public void applyFee() {
        System.out.println("일반 계좌 이체 수수료 500원 차감");
    }
}

class VIPAccount extends BankAccount {

    public VIPAccount(String owner, int balance) {
        super(owner, balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("방현서", 10000);
        ArrayList<BankAccount> bankList = new ArrayList<>();
        bankList.add(new BankAccount("방현서", 10000));
        bankList.add(new SavingsAccount("김철수", 50000, 0.05));

        for (BankAccount acc : bankList) {
            acc.ShowInfo();
        }

        System.out.println("=============================");

        Map<String, String> userMap = new HashMap<>();

        userMap.put("name", "아기사자");
        userMap.put("role", "백엔드 개발자");

        System.out.println("이름:" + userMap.get("name"));

        try {
            int withdrawAmount = 50000;

            if(withdrawAmount > account.GetBalance()) {
                throw new Exception("잔액이 부족합니다!");
            }
            System.out.println("출금 성공");

        } catch (Exception e) {
            System.out.println("출금 실패 사유: " + e.getMessage());
        }
    }
}