package com.booleanuk.extension;

public class OverdraftRequest {
    private float amount;
    private String reason;
    private Account account;

    public OverdraftRequest(float amount, String reason, Account account) {
        this.amount = amount;
        this.reason = reason;
        this.account = account;
    }

    public void approve(){
        account.setApprovedOverdraw(amount);
    }

    public void deny(){
        // probably send a message or notify accountholder someway
    }

    public String getReason() {
        return reason;
    }
}
