package com.wubinben.intellij.extractDelegate;

public class Foo {
    private final Info info = new Info();

    public String getInfo() {
        return info.getInfo();
    }
}
