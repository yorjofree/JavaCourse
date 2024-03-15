package com.freiorio;

public class ClickCounter {
    int value;

    public ClickCounter() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void click() {
        (this.value)++;
    }

    public void undo() {
        if (this.value > 0) {
            (this.value)--;
        }
    }

    public void reset() {
        this.value = 0;
    }
}
