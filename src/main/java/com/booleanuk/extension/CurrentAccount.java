package com.booleanuk.extension;

public class CurrentAccount extends Account {
    protected float approvedOverdraw = 0;

    public CurrentAccount(String name) {
        super(name);
    }

    public void setApprovedOverdraw(float approvedOverdraw) {
        this.approvedOverdraw = approvedOverdraw;
    }

    @Override
    public boolean withdraw(float amount){
        if (amount > 0 && getBalance() + approvedOverdraw >= amount){
            transactions.add(new Transaction(-amount));
            return true;
        }
        return false;
    }
}
