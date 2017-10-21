package com.wubinben.intellij.extractField;

public class Class {
    AnotherClass anotherClass;
    private int number;

    public void method() {
        int a = 1;
        number = anotherClass.intValue();
        int b = a + number;
        int c = b + anotherClass.intValue();
    }
}
