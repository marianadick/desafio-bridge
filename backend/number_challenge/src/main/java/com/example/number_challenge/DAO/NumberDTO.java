package com.example.number_challenge.DAO;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class NumberDTO {
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

    public void setK(int k) { this.k = k;}

    public int getResult() {
        return this.result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
