package src10;

import src5.BankAccount;
import src6.SavingsAccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> bankList = new ArrayList<>();
        bankList.add(new BankAccount("홍길동", 10000));
        bankList.add(new SavingsAccount("김철수", 50000, 0.05));

        for(BankAccount acc : bankList) {
            acc.showInfo();
        }

        System.out.println("====================================");

        Map<String, String> userMap = new HashMap<>();

        userMap.put("name", "아기사자");
        userMap.put("role", "백엔드 개발자");

        System.out.println("이름: " + userMap.get("name"));
    }
}