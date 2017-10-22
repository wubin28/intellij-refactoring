package com.wubinben.intellij.typeMigration;

public class FromGenericTypeStringToInteger implements I<Integer> {
    Integer myString;
    public Integer foo(final Integer s) {
        if (s == null) {
            return myString;
        }
        return s;
    }
}
