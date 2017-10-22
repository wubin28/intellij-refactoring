package com.wubinben.intellij.useInterfaceWherePossible;

public class AnotherClass {
    Class firstClass;
    Class secondClass;
    public void method() {
        firstClass.publicMethod();
        firstClass.hiddenMethod();
        secondClass.publicMethod();
        if (secondClass instanceof Class) {
            //...
        }
        //...
    }
}
