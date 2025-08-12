package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private List<OverdraftRequest> requests = new ArrayList<>();

    public void approveRequest(OverdraftRequest request){
        request.approve();
        requests.remove(request);
    }

    public void denyRequest(OverdraftRequest request){
        request.deny();
        requests.remove(request);
    }

    public void addRequest(OverdraftRequest request){
        requests.add(request);
    }

    public List<OverdraftRequest> getRequests() {
        return requests;
    }
}
