package com.wubinben.intellij.invertBoolean;

public class ReturnValueOfMethod {
    private double a;
    //...
    public boolean method() {
        if (a > 15 && a < 100) {
            a = 5;
            return true;
        }
        return false;
    }
}
