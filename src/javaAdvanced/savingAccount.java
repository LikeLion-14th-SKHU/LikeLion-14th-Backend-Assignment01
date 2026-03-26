package javaAdvanced;

public class savingAccount extends bankAccount{
    private double interestRate; //이자율

    //생성자
    public savingAccount(String ower, int balance, double interestRate) {
        super(ower, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        System.out.println("이자가 추가되었습니다.");
    }

    @Override
    public void showInfo() {
        //부모 private 필드에 접근하기 위해 Getter 사용!
        System.out.println("예금주: " + getOwer() + ", 잔액: " + getBalance() + ", 이자: " + interestRate);
    }
}
