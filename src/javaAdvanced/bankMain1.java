package javaAdvanced;

public class bankMain1 {

    void main() {
        //객체 생성1
        bankAccount account = new bankAccount("홍길동", 10000);

        account.showInfo();

        account.setOwer("전천우");
        account.showInfo();

        account.deposit();
        account.deposit(5000,"Memo");
        account.showInfo();

    }

}


