package com.company;

public class Adder {
    int value;
    int step;

    public Adder(int step) {
        this.step = step;
    }

    int getValue() {
        return value;
    }

    void add() {
        value += this.step;
    }

    public static void main(String[] args) {
        Adder adder = new Adder(10);
        adder.add();
        adder.add();
        System.out.println(adder.getValue());
    }
}

