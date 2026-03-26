package javaAdvanced;

public class downcastingMain1 {

    static void main() {

        //bankAccount형 배열 생성 (부모는 자식을 담을수 있다.)
        bankAccount[] accounts = new bankAccount[2];
        //업 캐스팅 활용: 여러 종류 계좌를 부모 타입 배열 하나로 묶어서 관리
        accounts[0] = new bankAccount("일반인",10000);
        accounts[1] = new savingAccount("홍길동", 10000, 0.5); //업캐스팅 발생

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("=== [" + i + "]번 계좌 처리 ===");
            bankAccount currentAccount = accounts[i];
            currentAccount.showInfo();
            
            if (currentAccount instanceof savingAccount) {
                savingAccount realAccount = (savingAccount) currentAccount;
                
                realAccount.addInterest();
                System.out.println("다운캐스팅 성공: 이자 추가 완료");
            } else {
                System.out.println("일반 계좌이므로 이자 추가 기능 없음");
            }
        }
    }
}
