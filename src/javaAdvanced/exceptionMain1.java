package javaAdvanced;

public class exceptionMain1 {
    static void main() {
        bankAccount myAccount = new bankAccount("전천우", 10000);

        try {
            int withdrawAmount = 50000;

            //getter 사용 안전 잔액 확인
            if (withdrawAmount > myAccount.getBalance()) {
             // 잔액 부족 시 강제 에러 발생 시킴
                throw new Exception("잔액이 부족합니다.");
            }
            System.out.println("출금 성공");
        }
        catch (Exception e) {
            //에러 발생 시, 프로글잼 종료 대신 에러 메시지 출력
            System.out.println("출금 실패 사유: " + e.getMessage());
        }


    }
}
