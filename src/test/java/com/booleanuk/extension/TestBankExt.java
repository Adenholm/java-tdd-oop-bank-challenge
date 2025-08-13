package com.booleanuk.extension;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBankExt {
    @Test
    public void testDenyOverdraft(){
        Branch branch = new Branch();
        CurrentAccount account = new CurrentAccount("Main account");
        branch.addAccount(account);
        branch.requestOverDraft(10000f, "Need money for luxury car", account);
        Assertions.assertEquals(1, branch.getRequests().size());
        branch.denyRequest(branch.getRequests().getFirst());
        Assertions.assertEquals(0, branch.getRequests().size());
        Assertions.assertFalse(account.withdraw(100f));
        Assertions.assertEquals(0, account.getBalance());
    }

    @Test
    public void testApproveOverdraft(){
        Branch branch = new Branch();
        CurrentAccount account = new CurrentAccount("Main account");
        branch.addAccount(account);
        branch.requestOverDraft(1000f, "Need money for rent", account);
        Assertions.assertEquals(1, branch.getRequests().size());
        branch.approveRequest(branch.getRequests().getFirst());
        Assertions.assertEquals(0, branch.getRequests().size());
        Assertions.assertTrue(account.withdraw(100f));
        Assertions.assertEquals(-100f, account.getBalance());
    }
}
