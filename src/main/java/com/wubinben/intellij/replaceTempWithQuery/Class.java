package com.wubinben.intellij.replaceTempWithQuery;

public class Class {
    public void method() {
        String str ="str";
        System.out.println(aString(str));
    }

    private String aString(String str) {
        return returnString().concat(str);
    }

    private String returnString() {
        return null;
    }
}
