package com.wubinben.intellij.extractField;

public class Class {
    AnotherClass anotherClass;
    public void method() {
        int a = 1;
        int b = a + anotherClass.intValue();
        int c = b + anotherClass.intValue();
    }
}
