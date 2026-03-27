package src9;

import src5.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("홍길동", 10000);

        try {
            int withdrawAmount = 50000;

            if(withdrawAmount > myAccount.getBalance()) {
                throw new Exception("잔액이 부족합니다!");
            }
            System.out.println("출금 성공");

        } catch (Exception e) {
            System.out.println("출금 실패 사유: " + e.getMessage());
        }
    }
}