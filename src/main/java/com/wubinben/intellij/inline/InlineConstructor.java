package com.wubinben.intellij.inline;

public class InlineConstructor {
    public int varInt;
    public InlineConstructor() {
        this(0);
    }

    public InlineConstructor(int i) {
        varInt=i;
    }

    public void method() {
        InlineConstructor aClass=new InlineConstructor();
        //...
    }
}
