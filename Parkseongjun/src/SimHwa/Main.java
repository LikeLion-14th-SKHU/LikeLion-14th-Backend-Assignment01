package SimHwa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

interface Chargeable {
    void applyFee();
}

class BankAccount implements Chargeable {
    private String owner;
    private int balance;

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

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

    public void deposit(int amount, String memo) {
        balance += amount;
        System.out.println(memo + " 메모와 함께 " + amount + "원 입금 완료");
    }

    public void showInfo() {
        System.out.println("예금주: " + owner + ", 잔액: " + balance);
    }

    @Override
    public void applyFee() {
        System.out.println("일반 계좌 이체 수수료 500원 차감");
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String owner, int balance, double interestRate) {
        super(owner, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        System.out.println("이자가 추가되었습니다.");
    }

    @Override
    public void showInfo() {
        System.out.println("예금주: " + getOwner() + ", 잔액: " + getBalance() + ", 이자율: " + interestRate);
    }
}

class VIPAccount extends BankAccount {
    public VIPAccount(String owner, int balance) {
        super(owner, balance);
    }

    @Override
    public void applyFee() {
        System.out.println(getOwner() + " VIP 계좌는 이체 수수료 면제");
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("홍길동", 10000);

        try {
            int withdrawAmount = 50000;

            if (withdrawAmount > myAccount.getBalance()) {
                throw new Exception("잔액이 부족합니다!");
            }

            System.out.println("출금 성공");
        } catch (Exception e) {
            System.out.println("출금 실패 사유: " + e.getMessage());
        }

        System.out.println("=================================");

        ArrayList<BankAccount> bankList = new ArrayList<>();
        bankList.add(new BankAccount("홍길동", 10000));
        bankList.add(new SavingsAccount("김철수", 50000, 0.05));

        for (BankAccount acc : bankList) {
            acc.showInfo();
        }

        System.out.println("=================================");

        Map<String, String> userMap = new HashMap<>();
        userMap.put("name", "아기사자");
        userMap.put("role", "백엔드 개발자");

        System.out.println("이름: " + userMap.get("name"));
    }
}