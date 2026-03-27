package src7;

import src5.BankAccount;
import src6.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[2]; // 마찬가지로 [생성자] [변수명] = new [타입] -> 공간이 2개인 accounts라는 배열 생성
        accounts[0] = new BankAccount("일반인", 10000);
        accounts[1] = new SavingsAccount("홍길동", 10000, 0.05);

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("--- [" + i + "]번 계좌 처리 ---");
            BankAccount currentAccount = accounts[i];
            currentAccount.showInfo();

            if (currentAccount instanceof SavingsAccount) {
                SavingsAccount realAccount = (SavingsAccount) currentAccount;

                realAccount.addInterest();
                System.out.println("다운캐스팅 성공: 이자 추가 완료");
            }
            else {
                System.out.println("일반 계좌이므로 이자 추가 기능 없음");
            }
        }
    }
}