package com.wubinben.intellij.replaceConstructorWithFactoryMethod;

public class Class {
    private Class(String s) {
    }

    public static Class createClass(String s) {
        return new Class(s);
    }
}
