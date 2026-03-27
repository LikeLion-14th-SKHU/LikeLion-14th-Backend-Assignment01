package src4;

import src5.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("홍길동", 10000); //src5에서 선언해놓은 메소드로 변수에
        account.showInfo(); //src5에서 만들어놓은 메소드로 예금주와 잔액 현황 표기

        account.setOwner("장진혁");
        account.showInfo();

        account.deposit(5000);
        account.deposit(5000, "Memo");
        account.showInfo();
    }
}