package com.test;

public class PowerFunction implements BinaryFunction {
    @Override
    public int fn(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
