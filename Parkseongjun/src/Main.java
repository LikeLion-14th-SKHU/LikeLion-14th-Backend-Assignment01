public class Main {
    public static void main(String[] args) {
        int age = 25;
        boolean isStudent = true;
        char grade = 'A';
        double GPA = 3.78;

        System.out.println(age);
        System.out.println(isStudent);
        System.out.println(grade);
        System.out.println(GPA);

        String name = "박성준";
        System.out.println(name);

        int[] num = new int[5];

        int[] fibonacci = new int[] {1,1,2,3,6};

        if(fibonacci[4] == 5){
            System.out.println("이 수열은 올바릅니다.");
        }
        else {
            System.out.println("피보나치 수열의 5번째 값은 5입니다.");
        }

        String[] timetable = {"머신러닝", "컴퓨터비전", "데이터기초수학", "심층신경망", "현대사회와법1", "알고리즘"};

        for(int idx = 0; idx < timetable.length; idx++) {
            System.out.println(timetable[idx]);
        }

        for(String str : timetable) {
            System.out.println(str);
        }


    }
}

