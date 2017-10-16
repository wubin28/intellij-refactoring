package com.wubinben.intellij.convertToInstanceMethod;

public class MyClass {
    ClassA classA = new ClassA();
    ClassB classB = new ClassB();

    public void myMethod() {
        classA.greatMethod(classB);
    }
}
