// 자식 클래스 (일반 계좌의 기능을 물려받은 적금 계좌)
class SavingsAccount extends BankAccount {
    private double interestRate; // 이자율 (적금 계좌만의 고유 필드)

    public SavingsAccount(String owner, int balance, double interestRate) {
        super(owner, balance); // 부모의 생성자 호출
        this.interestRate = interestRate;
    }

    public void addInterest() {
        System.out.println("이자가 추가되었습니다.");
    }

    // 메서드 오버라이딩
    @Override
    public void showInfo() {
        // 부모의 private 필드에 접근하기 위해 Getter 사용!
        System.out.println("예금주: " + getOwner() + ", 잔액: " + getBalance() + ", 이자율: " + interestRate);
    }
}