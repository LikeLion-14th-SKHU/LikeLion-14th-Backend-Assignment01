package javaBasic.forPractice;

//for,iter 사용 예제
public class Main {
    static void main() {
        String[] timeTable = {"머신러닝","컴퓨터비전","데이터기초수학","심층신경망","현대사회와법1","알고리즘"};

        System.out.println("-------for문 사용 결과-------");
        for (int idx = 0; idx < timeTable.length; idx++) {
            System.out.println(timeTable[idx]);
        }
        System.out.println("-------상향된 for문 사용 결과-------");
        //iterator - 상향된 for문 사용
        for (String str : timeTable) {
            System.out.println(str);
        }
    }
}
