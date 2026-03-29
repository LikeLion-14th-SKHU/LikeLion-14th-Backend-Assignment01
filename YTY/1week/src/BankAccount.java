class BankAccount implements Chargeable{
    private String owner;
    private int balance; // 외부에서 접근 불가

    // 생성자
    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Getter (은닉된 데이터에 접근할 수 있는 통로)
    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    // Setter (이름 개명 시 사용)
    public void setOwner(String owner) {
        this.owner = owner;
    }

    // 기본 입금 메서드
    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원이 입금 완료");
    }

    // 오버로딩: 금액과 함께 입금 메시지(메모)를 남기는 기능
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

