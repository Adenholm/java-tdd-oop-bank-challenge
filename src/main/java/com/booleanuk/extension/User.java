package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account){
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void printBankStatements(Account account){
        System.out.println(account.generateStatements());
    }
}
