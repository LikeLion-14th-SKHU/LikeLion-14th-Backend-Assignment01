import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 수수료를 계산해야 한다는 규칙 (인터페이스)
interface Chargeble {
    void applyFee();
}

// 부모 클래스가 인터페이스를 구현하도록 설정
class BankAccount implements Chargeble {
    private String owner; // 예금주 (외부에서 접근 불가)
    private int balance; // 잔액 (외부에서 접근 불가)

    // 생성자 (계좌 개설 시 예금주와 초기 금액 설정)
    public BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }

    // Getter (은닉된 데이터에 접근할 수 있는 통로)
    public String getOwner(){
        return owner;
    }

    public int getBalance(){
        return balance;
    }

    // Setter (이름 개명 시 사용)
    public void setOwner(String owner){
        this.owner = owner;
    }

    // 기본 입금 메서드
    public void deposit(int amount){
        balance += amount;
        System.out.println(amount + "원이 입금 완료");
    }

    // 오버로딩: 금액과 함께 입금 메시지(메모)를 남기는 기능
    public void deposit(int amount, String message) {
        balance += amount;
        System.out.println(message + " 메모와 함께 " + amount + "원 입금 완료");
    }

    public void showInfo() {
        System.out.println("예금주: " + owner + ", 잔액 " + balance);
    }

    @Override
    public void applyFee() {
        System.out.println("일반 계좌 이체 수수료 500원 차감");
    }
}

// 자식 클래스 (일반 계좌의 기능을 물려받은 적금 계좌)
class SavingsAccount extends BankAccount{
    private double interestRate; // 이자율 (적금 계좌만의 고유 필드)

    public SavingsAccount(String owner, int balance, double interestRate){
        super(owner, balance);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        System.out.println("이자가 추가되었습니다.");
    }

    // 메서드 오버라이딩
    @Override
    public void showInfo() {
        // 부모의 private 필드에 접근하기 위해 Getter 사용!
        System.out.println("예금주: " + getOwner() + ", 잔액: " + getBalance() + ", 이자율: " + interestRate);
    }
}

// VIP 계좌 (상속과 인터페이스의 장점을 모두 활용)
class VIPAccount extends BankAccount {

    public VIPAccount(String owner, int balance) {
        super(owner, balance);
    }

    // VIP는 수수료가 면제되므로, 부모의 수수료 차감 방식을 재정의 (오버라이딩)
    @Override
    public void applyFee() {
        System.out.println(getOwner() + "VIP 계좌는 이체 수수료 면제");
    }
}

public class Main {
    public static void main(String[] args) {
        // List (배열처럼 순서대로 데이터 저장)
        ArrayList<BankAccount> bankList = new ArrayList<>();
        bankList.add(new BankAccount("홍길동", 10000));
        bankList.add(new SavingsAccount("고재민", 50000, 0.05));

        for (BankAccount acc : bankList) {
            acc.showInfo();
        }

        System.out.println("==================================");


        // Map (key와 value를 하나의 쌍으로 저장)
        // Spring에서 Json 데이터를 다룰 때 매우 자주 사용
        Map<String, String> userMap = new HashMap<>();

        userMap.put("name", "아기사자"); // "name"이라는 이름표에 "아기사자" 저장
        userMap.put("role", "백엔드 개발자");

        System.out.println("이름: " + userMap.get("name"));
    }
}