package com.wubinben.intellij.typeMigration;

public class FromGenericTypeStringToInteger implements I<String> {
    String myString;
    public String foo(final String s) {
        if (s == null) {
            return myString;
        }
        return s;
    }
}
