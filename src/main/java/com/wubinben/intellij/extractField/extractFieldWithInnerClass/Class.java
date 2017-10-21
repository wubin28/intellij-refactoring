package com.wubinben.intellij.extractField.extractFieldWithInnerClass;

public class Class {
    AnotherClass anotherClass;
    private AnotherClass.InnerClass aClass;

    public void method() {
        aClass = anotherClass.innerClass;
        int a = aClass.i;
        int b = anotherClass.innerClass.j;
    }
}
