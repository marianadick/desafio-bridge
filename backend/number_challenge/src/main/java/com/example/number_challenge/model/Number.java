package com.example.number_challenge.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Number {
    @NotNull
    @Min(2)
    private int k;
    private int result;
    private long time;

    public int getK() {
        return this.k;
    }

    public long getTime() {
        return this.time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getResult() {
        return this.result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
