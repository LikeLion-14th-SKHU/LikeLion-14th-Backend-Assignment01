package javaAdvanced;

public class upcastingMain1 {

    static void main() {

        //bankAccount형 배열 생성 (부모는 자식을 담을수 있다.)
        bankAccount[] accounts = new bankAccount[2];
        //업 캐스팅 활용: 여러 종류 계좌를 부모 타입 배열 하나로 묶어서 관리
        accounts[0] = new bankAccount("일반인",10000);
        accounts[1] = new savingAccount("홍길동", 10000, 0.05); //업캐스팅 발생

        //다형성 동작: 반복문 한 번으로 모든 계좌 정보 출력
        //부모 클래스로 선언했지만, 오버라이딩을 통해 자식의 기능 우선 탐색함
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].showInfo();
        }
    }
}
