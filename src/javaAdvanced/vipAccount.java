package javaAdvanced;

public class vipAccount extends bankAccount{

    public vipAccount(String ower, int balance) {
        super(ower, balance);
    }

    public void applyFee() {
        System.out.println(getOwer() + "계좌는 이체 수수료 면제");

    }
}
