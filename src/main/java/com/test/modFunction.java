package com.test;

public class modFunction implements BinaryFunction{
    @Override
    public int fn(int a, int b) {
        return a % b;
    }
}