package com.test;

public class DivFunction implements BinaryFunction{
    @Override
    public int fn(int a, int b) {
        return (int) a/b;
    }
}
