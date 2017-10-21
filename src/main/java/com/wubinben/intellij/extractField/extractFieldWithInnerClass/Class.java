package com.wubinben.intellij.extractField.extractFieldWithInnerClass;

public class Class {
    AnotherClass anotherClass;

    public void method() {
        int a = anotherClass.innerClass.i;
        int b = anotherClass.innerClass.j;
    }
}
