package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private List<OverdraftRequest> requests = new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();

    public void approveRequest(OverdraftRequest request){
        request.approve();
        requests.remove(request);
    }

    public void denyRequest(OverdraftRequest request){
        request.deny();
        requests.remove(request);
    }

    public List<OverdraftRequest> getRequests() {
        return requests;
    }

    public void requestOverDraft(float amount, String reason, Account account){
        requests.add(new OverdraftRequest(amount, reason, account));
    }

    public void addAccount(Account account){
        accounts.add(account);
    }
}
