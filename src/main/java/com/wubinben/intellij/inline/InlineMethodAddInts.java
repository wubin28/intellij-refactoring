package com.wubinben.intellij.inline;

public class InlineMethodAddInts {
    private int a;
    private int b;

    public void method() {
        int c=add(a,b);
        int d=add(a,c);
    }

    private int add(int a, int b) {
        return a+b;
    }
}
