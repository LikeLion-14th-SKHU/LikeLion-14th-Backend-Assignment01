package javaAdvanced;

public class vipMain1 {

    static void main() {
        //부모 타입 배열로 묶어서 한번에 관리 가능
        bankAccount[] accounts = {new bankAccount("일반회원",10000),new vipAccount("VIP",50000)};
        for (bankAccount account : accounts) {
            //어떤 자식 클래스인지 관계없이 알아서 다르게 동작
            account.applyFee();
        }
    }
}
