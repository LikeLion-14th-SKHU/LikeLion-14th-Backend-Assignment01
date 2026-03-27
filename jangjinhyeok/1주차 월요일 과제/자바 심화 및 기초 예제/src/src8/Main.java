package src8;

import src5.BankAccount;

interface Chargeable {
    void applyFee();
}

class ChargeableBankAccount extends src5.BankAccount implements Chargeable {
    public ChargeableBankAccount(String owner, int balance) {
        super(owner, balance);
    }

    @Override
    public void applyFee() {
        System.out.println("일반 계좌 이체 수수료 500원 차감");
    }
}

class VIPAccount extends ChargeableBankAccount {
    public VIPAccount(String owner, int balance) {
        super(owner, balance);
    }

    public void applyFee() {
        System.out.println(getOwner() + "VIP 계좌는 이체 수수료 면제");
    }
}

public class Main {
    public static void main(String[] args) {
        Chargeable[] accounts = {
                new ChargeableBankAccount("일반회원", 10000),
                new VIPAccount("우수회원", 50000)
        };

        for (Chargeable account : accounts) {
            account.applyFee();
        }
    }
}