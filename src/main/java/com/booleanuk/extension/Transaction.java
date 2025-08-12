package com.booleanuk.extension;

import java.time.LocalDateTime;

public class Transaction {
    private final float delta;
    private final LocalDateTime timeStamp;

    public Transaction(float delta) {
        this.delta = delta;
        this.timeStamp = LocalDateTime.now();
    }

    public float getDelta() {
        return delta;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }
}
