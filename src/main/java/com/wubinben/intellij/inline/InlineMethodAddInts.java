package com.wubinben.intellij.inline;

public class InlineMethodAddInts {
    private int a;
    private int b;

    public void method() {
        int c= a + b;
        int d= a + c;
    }

}
