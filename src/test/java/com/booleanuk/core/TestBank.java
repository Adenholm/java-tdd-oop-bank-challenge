package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;

public class TestBank {
    @Test
    public void testCreatingAccount(){
        User user = new User();
        user.addAccount(new CurrentAccount());
        user.addAccount(new SavingsAccount());
        Assertions.assertEquals(2, user.getAccounts().size());
    }

    @Test
    public void testDepositandWithdraw(){
        Account account = new CurrentAccount();
        Assertions.assertFalse(account.withdraw(700f));
        Assertions.assertTrue(account.deposit(500f));
        Assertions.assertTrue(account.withdraw(250f));
        Assertions.assertEquals(250f, account.getBalance());
    }

    @Test
    public void testPrintBankstatement(){
        Account account = new CurrentAccount();
        Assertions.assertTrue(account.deposit(500f));
        Assertions.assertTrue(account.withdraw(250f));
        Assertions.assertEquals(250f, account.getBalance());
        System.out.println(account.generateStatements());
        String date = new SimpleDateFormat("dd/MM/yyyy").format(new java.util.Date());
        Assertions.assertEquals("date       || credit     || debit      || balance   \n" +
                date + " ||            || 250.0      || 250.0     \n" +
                date + " || 500.0      ||            || 500.0     \n", account.generateStatements());
    }
}
