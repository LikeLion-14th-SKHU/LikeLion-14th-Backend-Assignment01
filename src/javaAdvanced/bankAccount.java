package javaAdvanced;

class bankAccount implements chargeAble
{
    //캡슐화
    private String ower; //예금주
    private int balance; //잔액

    //생성자1
    public bankAccount(String ower, int balance) {
        this.ower = ower;
        this.balance = balance;
    }

    //getter
    public String getOwer() {
        return ower;
    }

    public int getBalance() {
        return balance;
    }

    //setter
    public void setOwer(String ower) {
        this.ower = ower;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //입금 메서드1
    void deposit() {
        balance += 5000;
    }

    //입금 메서드2: 오버로딩, 금액과 함계 입금 메시지를 남기는 기능
    void deposit(int amount, String message){
        balance += amount;
        System.out.println("\""+ message + "\"" + " 메모와 함계 " + amount + "원 입금 완료");

    }

    public void showInfo() {
        System.out.println("예금주: " + ower + ", 잔액: " + balance);
    }

    @Override
    public void applyFee() {
        System.out.println("일반 계좌 이체 수수료 500원 차감");
    }
}
