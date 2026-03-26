package javaBasic.array;

//javaBasic.array 선언 및 사용, 조건문 예제
public class Main {
    static void main() {
        String name = "전천우";
        System.out.println(name);

        //타입 [] 변수 = new 타입[길이];
        int[] num = new int[5];

        //변수 = new int[] {값1,값2,값3,값4.....}
        int[] fibonacci = new int[] {1, 1, 2, 3, 6};

        //fibonacci[4] = 5;

        if (fibonacci[4] == 5) {
            System.out.println("이 수열을 올바릅니다.");
        } else {
            System.out.println("피보나치 수열의 5번째 값은 5입니다.");
        }
    }
}
