package com.booleanuk.extension;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    protected List<Transaction> transactions = new ArrayList<>();
    protected String name;
    protected long accountNumber;


    public Account(String name) {
        this.name = name;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public float getBalance() {
        float balance = 0;
        for (Transaction trs : transactions){
            balance += trs.getDelta();
        }
        return balance;
    }

    public boolean deposit(float amount){
        if (amount > 0){
            transactions.add(new Transaction(amount));
            return true;
        }
        return false;
    }

    public boolean withdraw(float amount){
        if (amount > 0 && getBalance() >= amount){
            transactions.add(new Transaction(-amount));
            return true;
        }
        return false;
    }

    public String generateStatements(){
        StringBuilder str = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        str.append(String.format("%1$-10s || %2$-10s || %3$-10s || %4$-10s\n", "date", "credit", "debit", "balance"));
        float balance = 0;
        List<String> rows = new ArrayList<>();
        for (Transaction trs: transactions){
            balance += trs.getDelta();
            if(trs.getDelta() > 0){
                rows.add(String.format("%1$-10s || %2$-10s || %3$-10s || %4$-10s\n", trs.getTimeStamp().format(formatter), trs.getDelta(), "", balance));
            }
            else {
                rows.add(String.format("%1$-10s || %2$-10s || %3$-10s || %4$-10s\n", trs.getTimeStamp().format(formatter), "", Math.abs(trs.getDelta()), balance));
            }
        }
        for (String row: rows.reversed()){
            str.append(row);
        }
        return str.toString();
    }
}
