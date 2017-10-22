package com.wubinben.intellij.typeMigration;

public class FromIntToString {
    String f;
    void bar(String i) {}
    void foo() {
        bar(f);
    }
}
