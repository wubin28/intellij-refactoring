package com.wubinben.intellij.useInterfaceWherePossible;

public class AnotherClass {
    Class firstClass;
    Interface secondInterface;
    public void method() {
        firstClass.publicMethod();
        firstClass.hiddenMethod();
        secondInterface.publicMethod();
        if (secondInterface instanceof Interface) {
            //...
        }
        //...
    }
}
