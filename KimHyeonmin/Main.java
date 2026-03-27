//정보를 저장하는 방법----------------------------------------------
//자료형과 기본형 변수----------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        int age = 22;
//        boolean isStudent = true;
//        char grade = 'A';
//        double GPA = 3.78;
//
//        System.out.println(age);
//        System.out.println(isStudent);
//        System.out.println(grade);
//        System.out.println(GPA);
//    }
//}

//참조형 변수-----------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        String name = "김현민";
//        System.out.println(name);
//
//        //타입[] 변수 = new 타입[길이];
//        int[] num = new int[5];
//
//        //변수 = new 타입[] { 값0, 값1, 값2, 값3, ... };
//        int[] fibonacci = new int[] {1,1,2,3,6};
//    }
//}

//조건문 (if-else)-----------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        //타입[] 변수 = new 타입[길이];
//        int[] num = new int[5];
//
//        //변수 = new 타입[] { 값0, 값1, 값2, 값3, ... };
//        int[] fibonacci = new int[] {1,1,2,3,6};
//
//        if (fibonacci[4] == 5) {
//            System.out.println("이 수열은 올바름.");
//        }
//        else {
//            System.out.println("피보나치 수열의 5번째 값은 5임.");
//        }
//    }
//}

//반복문 (for)---------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        String[] timetable = {"머신러닝", "컴퓨터비전", "데이터기초수학", "심층신경망", "현대사회와법1", "알고리즘"};
//
//        for(int idx = 0; idx < timetable.length; idx++) {
//            System.out.println(timetable[idx]);
//        }
//
//        for(String str : timetable) {
//            System.out.println(str);
//        }
//    }
//}

//객체지향을 알아보자-----------------------------------------------
//생성자---------------------------------------------------------
//class BankAccount {
//    String owner; //예금주
//    int balance;  //잔액
//
//    //생성자 (예금주와 초기 금액 설정)
//    BankAccount(String owner, int balance) {
//        this.owner = owner;
//        this.balance = balance;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        //객체 생성 (의 계좌 개설)
//        BankAccount account = new BankAccount("김현민", 10000);
//
//        System.out.println("예금주: " + account.owner + " / 잔액: " + account.balance);
//    }
//}

//메서드---------------------------------------------------------
//class BankAccount {
//    String owner; //예금주
//    int balance;  //잔액
//
//    //생성자 (예금주와 초기 금액 설정)
//    BankAccount(String owner, int balance) {
//        this.owner = owner;
//        this.balance = balance;
//    }
//
//    //메서드 (입금 기능)
//    void deposit(int amount) {
//        balance += amount;
//        System.out.println(amount + "원 입금 완료.");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        //객체 생성 (의 계좌 개설)
//        BankAccount account = new BankAccount("김현민", 10000);
//        account.deposit(5000); //메서드 테스트
//        System.out.println("예금주: " + account.owner + " / 잔액: " + account.balance);
//    }
//}

//메서드 오버로딩--------------------------------------------------
//class BankAccount {
//    String owner; //예금주
//    int balance;  //잔액
//
//    //기존 입금 메서드
//    void deposit(int amount) {
//        balance += amount;
//    }
//
//    //생성자 (예금주와 초기 금액 설정)
//    BankAccount(String owner, int balance) {
//        this.owner = owner;
//        this.balance = balance;
//    }
//
//    //오버로딩 = 금액 + 입금 메시지를 남기는 기능
//    void deposit(int amount, String message) {
//        balance += amount;
//        System.out.println(message + " 메모와 함께 " + amount + "원 입금 완료.");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        //객체 생성
//        BankAccount account = new BankAccount("김현민", 10000);
//
//        //첫 번째 입금 (오버로딩 1)
//        account.deposit(5000);
//        System.out.println("예금주: " + account.owner + " / 잔액: " + account.balance);
//
//        //두 번째 입금 (오버로딩 2 + 메모)
//        account.deposit(5000, "메모 예시");
//        System.out.println("예금주: " + account.owner + " / 잔액: " + account.balance);
//    }
//}

//캡슐화와 getter/setter-----------------------------------------
//class BankAccount {
//    private String owner;
//    private int balance; //외부 접근 불가
//
//    //생성자
//    public BankAccount(String owner, int balance) {
//        this.owner = owner;
//        this.balance = balance;
//    }
//
//    //getter (은닉된 데이터에 접근할 수 있는 통로)
//    public String getOwner() {
//        return owner;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    //setter (이름 개명 시 사용)
//    public void setOwner(String owner) {
//        this.owner = owner;
//    }
//
//    //기본 입금 메서드
//    public void deposit(int amount) {
//        balance += amount;
//        System.out.println(amount + "원 입금 완료.");
//    }
//
//    //오버로딩 = 금액 + 입금 메시지를 남기는 기능
//    public void deposit(int amount, String memo) {
//        balance += amount;
//        System.out.println(memo + " 메모와 함께 " + amount + "원 입금 완료.");
//    }
//
//    public void showInfo() {
//        System.out.println("예금주: " + owner + ", 잔액: " + balance);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount("김현민1", 10000);
//        account.showInfo();
//
//        account.setOwner("김현민2");
//        account.showInfo();
//
//        account.deposit(5000);
//        account.deposit(5000, "memo");
//        account.showInfo();
//    }
//}

//접근 제어자-----------------------------------------------------
//        - public: 어디서든 자유롭게 접근 가능.
//        - protected: 같은 패키지 내에서, 다른 패키지라도 상속받은 자식 클래스에서는 접근 가능.
//        - default: 아무것도 적지 않은 상태, 같은 패키지 안에서만 접근 가능.
//        - private: 오직 해당 클래스 내부에서만 접근할 수 있도록 데이터를 숨김. (getter/setter가 필요한 이유)

//상속----------------------------------------------------------
//class BankAccount {
//    private String owner; //예금주
//    private int balance;  //잔액
//
//    public BankAccount(String owner, int balance) {
//        this.owner = owner;
//        this.balance = balance;
//    }
//
//    //getter
//    public String getOwner() {
//        return owner;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public void showInfo() {
//        System.out.println("예금주: " + owner + " / 잔액: " + balance + "원");
//    }
//}
//
// //자식 클래스 (일반 계좌의 기능을 물려받은 적금 계좌)
//class SavingsAccount extends BankAccount {
//    private double interestRate; //이자율 (적금 계좌만의 고유 필드)
//
//    public SavingsAccount(String owner, int balance, double interestRate) {
//        super(owner, balance); //부모의 생성자 호출
//        this.interestRate = interestRate;
//    }
//
//    public void addInterest() {
//        System.out.println("이자가 추가됨.");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // 자식 클래스(적금 계좌)로 객체 1개 생성
//        SavingsAccount myAccount = new SavingsAccount("김현민", 10000, 0.05);
//
//        //부모에게 물려받은 기능
//        myAccount.showInfo();
//        //자식 본인만의 기능
//        myAccount.addInterest();
//    }
//}

// //메서드 오버라이딩-------------------------------------------------
//class BankAccount {
//    private String owner;
//    private int balance;
//
//    public BankAccount(String owner, int balance) {
//        this.owner = owner;
//        this.balance = balance;
//    }
//
//    public String getOwner() { return owner; }
//    public int getBalance() { return balance; }
//
//    public void showInfo() {
//        System.out.println("예금주: " + owner + ", 잔액: " + balance);
//    }
//}
//
//class SavingsAccount extends BankAccount {
//
//    private double interestRate; //이자율 (적금 계좌만의 고유 필드)
//    public SavingsAccount(String owner, int balance, double interestRate) {
//        super(owner, balance); //부모의 생성자 호출
//        this.interestRate = interestRate;
//    }
//
//    public void addInterest() {
//        System.out.println("이자가 추가됨.");
//    }
//
//    //메서드 오버라이딩
//    @Override
//    public void showInfo() {
//        //부모의 private 필드에 접근하기 위해 getter 사용
//        System.out.println("예금주: " + getOwner() + ", 잔액: " + getBalance() + ", 이자율: " + interestRate);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        SavingsAccount myAccount = new SavingsAccount("김현민", 10000, 0.05);
//
//        //부모의 showInfo가 아닌, 자식이 오버라이딩한 showInfo가 실행
//        myAccount.showInfo();
//    }
//}

//다형성---------------------------------------------------------
//업캐스팅-------------------------------------------------------
//class BankAccount {
//    private String owner;
//    private int balance;
//
//    public BankAccount(String owner, int balance) {
//        this.owner = owner;
//        this.balance = balance;
//    }
//
//    public String getOwner() { return owner; }
//    public int getBalance() { return balance; }
//
//    public void showInfo() {
//        System.out.println("예금주: " + owner + " / 잔액: " + balance);
//    }
//}
//
//class SavingsAccount extends BankAccount {
//    private double interestRate;
//
//    public SavingsAccount(String owner, int balance, double interestRate) {
//        super(owner, balance);
//        this.interestRate = interestRate;
//    }
//
//    @Override
//    public void showInfo() {
//        System.out.println("예금주: " + getOwner() + " / 잔액: " + getBalance() + " / 이자율: " + interestRate);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        //업캐스팅 활용 = 여러 종류의 계좌를 부모 타입(BankAccount) 배열 하나로 묶어서 관리
//        BankAccount[] accounts = new BankAccount[2];
//        accounts[0] = new BankAccount("일반인", 10000);
//        accounts[1] = new SavingsAccount("김현민", 10000, 0.05); //업캐스팅 발생
//
//        //다형성 동작 = 반복문 한 번으로 모든 계좌 정보 출력
//        for (int i = 0; i < accounts.length; i++) {
//            //부모(BankAccount) 클래스로 선언했지만
//            //자식(SavingsAccount)이 오버라이딩한 최신 기능이 알아서 실행됨.
//            accounts[i].showInfo();
//        }
//    }
//}

//다운캐스팅과 instanceof -----------------------------------------
//class BankAccount {
//    private String owner;
//    private int balance;
//
//    public BankAccount(String owner, int balance) {
//        this.owner = owner;
//        this.balance = balance;
//    }
//
//    public String getOwner() { return owner; }
//    public int getBalance() { return balance; }
//
//    public void showInfo() {
//        System.out.println("예금주: " + owner + " / 잔액: " + balance);
//    }
//}
//
//class SavingsAccount extends BankAccount {
//    private double interestRate;
//
//    public SavingsAccount(String owner, int balance, double interestRate) {
//        super(owner, balance);
//        this.interestRate = interestRate;
//    }
//
//    public void addInterest() {
//        System.out.println("적금 이자가 추가됨.");
//    }
//
//    @Override
//    public void showInfo() {
//        System.out.println("예금주: " + getOwner() + " / 잔액: " + getBalance() + " / 이자율: " + interestRate);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        //업캐스팅 상태 (부모 배열로 한 번에 관리)
//        BankAccount[] accounts = new BankAccount[2];
//        accounts[0] = new BankAccount("일반인", 10000);
//        accounts[1] = new SavingsAccount("김현민", 10000, 0.05);
//
//        for (int i = 0; i < accounts.length; i++) {
//            System.out.println("--- [" + i + "]번 계좌 처리 ---");
//            BankAccount currentAccount = accounts[i];
//            currentAccount.showInfo();
//
//            // 다운캐스팅 필요성 = currentAccount.addInterest(); -> 에러 발생 (부모 클래스에는 기능 없음.)
//
//            //instanceof를 사용해, 현재 꺼낸 객체가 SavingAccount인지 확인
//            if (currentAccount instanceof SavingsAccount) {
//
//                //원래 자식 타입으로 강제 변환 = 다운캐스팅)
//                SavingsAccount realAccount = (SavingsAccount) currentAccount;
//
//                //이제 자식 클래스의 이자 추가기능 사용 가능
//                realAccount.addInterest();
//                System.out.println("다운캐스팅 성공: 이자 추가 완료.");
//
//            } else {
//                System.out.println("일반 계좌이므로 이자 추가 기능 없음.");
//            }
//        }
//    }
//}

//인터페이스------------------------------------------------------
//수수료를 계산해야 한다는 규칙 = 인터페이스
//interface Chargeable {
//    void applyFee();
//}
//
// //부모 클래스가 인터페이스를 구현하도록 설정
//class BankAccount implements Chargeable {
//    private String owner;
//    private int balance;
//
//    public BankAccount(String owner, int balance) {
//        this.owner = owner;
//        this.balance = balance;
//    }
//
//    public String getOwner() { return owner; }
//
//    @Override
//    public void applyFee() {
//        System.out.println("일반 계좌 이체 수수료 500원 차감.");
//    }
//}
//
// //VIP 계좌 (상속과 인터페이스의 장점을 모두 활용)
//class VIPAccount extends BankAccount {
//    public VIPAccount(String owner, int balance) {
//        super(owner, balance);
//    }
//
//    // VIP는 수수료가 면제되므로, 부모의 수수료 차감 방식을 재정의(오버라이딩)
//    @Override
//    public void applyFee() {
//        System.out.println(getOwner() + " VIP 계좌는 이체 수수료 면제.");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        //부모 타입 배열로 묶어서 한 번에 관리 가능
//        BankAccount[] accounts = {
//                new BankAccount("일반회원", 10000),
//                new VIPAccount("우수회원", 50000)
//        };
//
//        for (BankAccount account : accounts) {
//            //어떤 자식 클래스인지 관계없이, 알아서 다르게 동작
//            account.applyFee();
//        }
//    }
//}

//기타 도구-------------------------------------------------------
//예외처리--------------------------------------------------------
//class BankAccount {
//    private String owner;
//    private int balance;
//
//    public BankAccount(String owner, int balance) {
//        this.owner = owner;
//        this.balance = balance;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        BankAccount myAccount = new BankAccount("김현민", 10000);
//
//        try {
//            int withdrawAmount = 50000; //출금 시도 금액
//
//            //getter를 사용하여 안전하게 잔액 확인
//            if(withdrawAmount > myAccount.getBalance()) {
//                //잔액 부족 시, 강제로 에러 발생
//                throw new Exception("잔액 부족.");
//            }
//            System.out.println("출금 성공.");
//
//        } catch (Exception e) {
//            //에러가 발생해도 종료하지 않고 에러 메시지를 출력
//            System.out.println("출금 실패 사유: " + e.getMessage());
//        }
//    }
//}

//컬렉션 프레임워크-------------------------------------------------
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//class BankAccount {
//    private String owner;
//    private int balance;
//
//    public BankAccount(String owner, int balance) {
//        this.owner = owner;
//        this.balance = balance;
//    }
//
//    public String getOwner() { return owner; }
//    public int getBalance() { return balance; }
//
//    public void showInfo() {
//        System.out.println("예금주: " + owner + " / 잔액: " + balance);
//    }
//}
//
//class SavingsAccount extends BankAccount {
//    private double interestRate;
//
//    public SavingsAccount(String owner, int balance, double interestRate) {
//        super(owner, balance);
//        this.interestRate = interestRate;
//    }
//
//    @Override
//    public void showInfo() {
//        System.out.println("예금주: " + getOwner() + " / 잔액: " + getBalance() + " / 이자율: " + interestRate);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        //List (순서대로 저장)
//        ArrayList<BankAccount> bankList = new ArrayList<>();
//        bankList.add(new BankAccount("김현민1", 10000));
//        bankList.add(new SavingsAccount("김현민2", 50000, 0.05));
//
//        for(BankAccount acc : bankList) {
//            acc.showInfo();
//        }
//
//        System.out.println("=================================");
//
//        //Map = key와 value를 하나의 쌍으로 저장
//        //Spring에서 JSON 데이터를 다룰 때, 자주 사용
//        Map<String, String> userMap = new HashMap<>();
//
//        userMap.put("name", "아기사자"); //name에 아기사자 저장
//        userMap.put("role", "백엔드 개발자");
//
//        System.out.println("이름: " + userMap.get("name"));
//    }
//}

//--------------------------------------------------------------

//부록
//오버플로우
//public class Main {
//    public static void main(String[] args) {
//        byte maxByte = 127;
//        maxByte++; // 127에 1을 더해 범위를 초과함
//
//        // 오버플로우 발생: byte의 최솟값인 -128로 돌아감
//        System.out.println("오버플로우 결과: " + maxByte);
//    }
//}

//동적/정적 바인딩
//class BankAccount {
//    // 1. 정적 바인딩 (컴파일 시점에 결정)
//    // 오버로딩된 메서드들은 실행 전부터 어떤 메서드가 불릴지 자바가 미리 알고 있습니다.
//    void deposit(int amount) { }
//    void deposit(int amount, String message) { }
//
//    void showInfo() {
//        System.out.println("일반 계좌입니다.");
//    }
//}
//
//class SavingsAccount extends BankAccount {
//    // 2. 동적 바인딩 (런타임에 결정)
//    // 부모 타입으로 업캐스팅 되어있더라도, 프로그램 실행 도중(런타임)에 실제 객체가
//    // SavingsAccount라는 것을 파악하고 이 오버라이딩된 메서드를 호출합니다.
//    @Override
//    void showInfo() {
//        System.out.println("적금 계좌입니다.");
//    }
//}

//추상 클래스
// // 추상 클래스 (미완성 설계도): 자체적으로는 객체(new)를 만들 수 없음
//abstract class AbstractBankAccount {
//    String owner;
//    int balance;
//
//    public AbstractBankAccount(String owner, int balance) {
//        this.owner = owner;
//        this.balance = balance;
//    }
//
//    // 추상 메서드: 구현부(중괄호)가 없음. 자식 클래스가 무조건 완성해야 함
//    abstract void applyFee();
//}
//
//class NormalAccount extends AbstractBankAccount {
//    public NormalAccount(String owner, int balance) {
//        super(owner, balance);
//    }
//
//    // 부모의 추상 메서드를 강제로 오버라이딩
//    @Override
//    void applyFee() {
//        System.out.println("일반 계좌: 수수료 500원 차감");
//        balance -= 500;
//    }
//}

//림다, 스트림API
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        List<BankAccount> bankList = new ArrayList<>();
//        bankList.add(new BankAccount("홍길동", 10000));
//        bankList.add(new BankAccount("김철수", 80000));
//        bankList.add(new BankAccount("이영희", 60000));
//
//        // 기존 방식: for문과 if문을 써서 복잡하게 걸러내야 함
//
//        // 스트림 API와 람다식 활용: 반복문 없이 파이프라인 형태로 깔끔하게 처리
//        // "잔액이 50000원 이상인 계좌만 필터링해서, 각각의 정보를 출력해라"
//        bankList.stream()
//                .filter(account -> account.getBalance() >= 50000)
//                .forEach(account -> account.showInfo());
//    }
//}

//예외처리 심화
//class BankAccount {
//    private int balance = 10000;
//
//    // Unchecked Exception: 컴파일러가 강제하지 않는 런타임 예외
//    // 예: 마이너스 금액을 입금하려는 경우
//    public void deposit(int amount) {
//        if (amount < 0) {
//            throw new IllegalArgumentException("입금액에는 음수 입력 불가");
//        }
//        balance += amount;
//    }
//
//    // Checked Exception: 컴파일러가 깐깐하게 확인하는 예외
//    // 예: 은행 서버와 통신하는 과정에서 생기는 외부 요인 에러
//    // 무조건 메서드 옆에 throws를 붙이거나 내부에 try-catch를 써야 함
//    public void transferToServer() throws Exception {
//        throw new Exception("네트워크 통신 오류 발생");
//    }
//}

//제네릭
// // 제네릭 클래스 만들기: <T> 자리에 나중에 원하는 타입을 자유롭게 넣을 수 있음
//class AccountBox<T> {
//    private T account;
//
//    public void setAccount(T account) {
//        this.account = account;
//    }
//
//    public T getAccount() {
//        return account;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // "이 상자에는 SavingsAccount(적금 계좌)만 들어간다"고 미리 지정
//        AccountBox<SavingsAccount> box = new AccountBox<>();
//
//        box.setAccount(new SavingsAccount("홍길동", 10000, 0.05));
//
//        // 제네릭 덕분에 꺼낼 때 다운캐스팅(강제 형변환)을 생략해도 에러 발생 X
//        SavingsAccount myAccount = box.getAccount();
//        myAccount.addInterest();
//    }
//}

//java에서 자료구조
//import java.util.*;
//
//public class DataStructureExample {
//    public static void main(String[] args) {
//
//        // 1. 배열 (Array): 크기 고정
//        int[] array = new int[5];
//        array[0] = 10;
//
//        // 2. 리스트 (List): 가장 대중적으로 쓰이는 ArrayList
//        List<String> list = new ArrayList<>();
//        list.add("Java");
//        list.add("Python");
//
//        // 3. 연결 리스트 (Linked List): ArrayList보다 삽입/삭제가 빠름
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(100);
//
//        // 4. 맵 (Map): Key-Value 구조 (HashMap)
//        Map<String, Integer> map = new HashMap<>();
//        map.put("Apple", 1500);
//        map.put("Banana", 2000);
//        int price = map.get("Apple"); // 1500 반환
//
//        // 5. 스택 (Stack): LIFO
//        Stack<String> stack = new Stack<>();
//        stack.push("첫번째");
//        stack.push("두번째");
//        String top = stack.pop(); // "두번째" 반환 및 제거
//
//        // 6. 큐 (Queue): FIFO (Java에서는 보통 LinkedList로 구현)
//        Queue<String> queue = new LinkedList<>();
//        queue.offer("A");
//        queue.offer("B");
//        String first = queue.poll(); // "A" 반환 및 제거
//
//        // 7. 트리 (Tree): 정렬된 순서를 유지하는 TreeSet이나 TreeMap 사용
//        Set<Integer> treeSet = new TreeSet<>();
//        treeSet.add(5);
//        treeSet.add(1); // 내부적으로 정렬되어 저장됨
//
//        // 8. 그래프 (Graph): Java에서 기본 제공되는 클래스는 없으며,
//        // 보통 리스트의 배열(인접 리스트) 형태나 2차원 배열(인접 행렬)로 직접 구현합니다.
//        List<List<Integer>> graph = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            graph.add(new ArrayList<>());
//        }
//        graph.get(0).add(1); // 0번 노드와 1번 노드 연결
//    }
//}




