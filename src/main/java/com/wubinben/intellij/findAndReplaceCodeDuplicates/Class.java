package com.wubinben.intellij.findAndReplaceCodeDuplicates;

public class Class {

    public void method() {
        int a = 1;
        int b = 2;
        int c = add(a, b);
        int d = add(b, c);
    }

    private int add(int a, int b) {
        return a + b;
    }
}
