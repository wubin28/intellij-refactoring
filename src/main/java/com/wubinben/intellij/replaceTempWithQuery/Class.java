package com.wubinben.intellij.replaceTempWithQuery;

public class Class {
    public void method() {
        String str ="str";
        String aString = returnString().concat(str);
        System.out.println(aString);
    }

    private String returnString() {
        return null;
    }
}
