package com.wubinben.intellij.convertToInstanceMethod;

public class ClassA {
    public void greatMethod(ClassB classB) {
        System.out.println("classA = " + this);
        System.out.println("classB = " + classB);
    }
}
