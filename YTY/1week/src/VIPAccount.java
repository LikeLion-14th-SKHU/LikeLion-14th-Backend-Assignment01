class VIPAccount extends BankAccount {

    public VIPAccount(String owner, int balance) {
        super(owner, balance);
    }

    // VIP는 수수료가 면제되므로, 부모의 수수료 차감 방식을 재정의(오버라이딩)
    @Override
    public void applyFee() {
        System.out.println(getOwner() + "VIP 계좌는 이체 수수료 면제");
    }
}