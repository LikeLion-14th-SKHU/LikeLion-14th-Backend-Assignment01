public class B {
    public static void main(String[] args) {
        String[] timetable = {"머신러닝", "컴퓨터비전", "데이터기초수학", "심층신경망", "현대사회와법1", "알고리즘"};

        for(int idx = 0; idx < timetable.length; idx++) {
            System.out.println(timetable[idx]);
        }

        for(String str : timetable) {
            System.out.println(str);
        }
    }
}
