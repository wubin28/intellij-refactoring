package com.wubinben.intellij.replaceInheritanceWithDelegation;

public class Class {
    private final MySuperClass superClass = new MySuperClass();
    public int varInt;

    public void openMethod() {
        superClass.openMethod();
    }

    private class MySuperClass extends SuperClass {
        public void openMethod() {
            // biz logic
        }
    }
}
