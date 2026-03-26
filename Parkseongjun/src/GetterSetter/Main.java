package GetterSetter;

//class BankAccount {
//    private String owner;
//    private int balance; // 외부에서 접근 불가
//
//    public BankAccount(String owner, int balance) {
//        this.owner = owner;
//        this.balance = balance;
//    }
//
//    public String getOwner() {
//        return owner;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public void setOwner(String owner) {
//        this.owner = owner;
//    }
//
//    public void deposit(int amount) {
//        balance += amount;
//        System.out.println(amount + "원이 입금 완료");
//    }
//
//    // 오버로딩: 금액과 함께 입금 메시지(메모)를 남기는 기능
//    public void deposit(int amount, String memo) {
//        balance += amount;
//        System.out.println(memo + " 메모와 함께 " + amount + "원 입금 완료");
//    }
//
//    public void showInfo() {
//        System.out.println("예금주: " + owner + ", 잔액: " + balance);
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
//        System.out.println("이자가 추가되었습니다.");
//    }
//
//    @Override
//    public void showInfo() {
//        System.out.println("예금주: " + getOwner() + ", 잔액: " + getBalance() + ", 이자율: " + interestRate);
//    }
//}



//public class Main {
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount("홍길동", 10000);
//        account.showInfo();
//
//        account.setOwner("박성준");
//        account.showInfo();
//
//        account.deposit(5000);
//        account.deposit(5000, "Memo");
//        account.showInfo();
//    }
//}



//public class Main {
//    public static void main(String[] args) {
//        BankAccount[] accounts = new BankAccount[2];
//        accounts[0] = new BankAccount("일반인", 10000);
//        accounts[1] = new SavingsAccount("홍길동", 10000, 0.05);
//
//        for (int i = 0; i < accounts.length; i++) {
//            System.out.println("--- [" + i + "]번 계좌 처리 ---");
//            BankAccount currentAccount = accounts[i];
//            currentAccount.showInfo();
//
//            if (currentAccount instanceof SavingsAccount) {
//
//                SavingsAccount realAccount = (SavingsAccount) currentAccount;
//
//                realAccount.addInterest();
//                System.out.println("다운캐스팅 성공: 이자 추가 완료");
//
//            } else {
//                System.out.println("일반 계좌이므로 이자 추가 기능 없음");
//            }
//        }
//    }
//}

