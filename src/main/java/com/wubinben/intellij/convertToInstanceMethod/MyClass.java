package com.wubinben.intellij.convertToInstanceMethod;

public class MyClass {
    ClassA classA = new ClassA();
    ClassB classB = new ClassB();

    static public void greatMethod(ClassA classA, ClassB classB) {
        System.out.println("classA = " + classA);
        System.out.println("classB = " + classB);
    }

    public void myMethod() {
        MyClass.greatMethod(classA, classB);
    }
}
