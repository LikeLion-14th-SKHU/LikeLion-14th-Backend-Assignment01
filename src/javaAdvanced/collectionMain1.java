package javaAdvanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class collectionMain1 {

    static void main() {
        //List - 배열과 유사
        List<bankAccount> bankList = new ArrayList<>();
        bankList.add(new bankAccount("홍길동",10000));
        bankList.add(new savingAccount("김짱구",50000,0.05));

        for (bankAccount acc : bankList) {
            acc.showInfo();
        }
        System.out.println("===============================");
        //Map - 키와 값 쌍으로 저장
        //Spring에서 JSON 다룰 때 매우 자주 사용하니 중요하다.
        Map<String,String> userMap = new HashMap<>();

        userMap.put("name","아기사자"); //name 이라는 key, 아기사자 라는 value값 저장
        userMap.put("role","백엔드 개발자");

        System.out.println("이름: " + userMap.get("name"));




    }
}
