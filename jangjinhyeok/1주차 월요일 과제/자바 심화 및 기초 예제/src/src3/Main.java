package src3;

public class Main {
    public static void main(String[] args) {
        String[] timetable = {"머신러닝", "컴퓨터비전", "데이터기초수학", "심층신경망", "현대사회와법1", "알고리즘"};

        for(int idx = 0; idx < timetable.length; idx++) {
            System.out.println(timetable[idx]);
        }

        for(String str : timetable) {
            System.out.println(str);
        }
        // 둘다 결과는 같은데 후자가 더 간단함. 딱 배열만큼의 동작만 함.
    }
}
