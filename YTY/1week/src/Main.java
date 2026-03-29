import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // List (배열처럼 순서대로 데이터 저장)
        ArrayList<BankAccount> bankList = new ArrayList<>();
        bankList.add(new BankAccount("홍길동", 10000));
        bankList.add(new SavingsAccount("김철수", 50000, 0.05));

        for(BankAccount acc : bankList) {
            acc.showInfo();
        }

        System.out.println("=================================");

        // Map (key와 value를 하나의 쌍으로 저장)
        // Spring에서 JSON 데이터를 다룰 때 매우 자주 사용
        Map<String, String> userMap = new HashMap<>();

        userMap.put("name", "아기사자"); // "name"이라는 이름표에 "아기사자" 저장
        userMap.put("role", "백엔드 개발자");

        System.out.println("이름: " + userMap.get("name"));
    }
}