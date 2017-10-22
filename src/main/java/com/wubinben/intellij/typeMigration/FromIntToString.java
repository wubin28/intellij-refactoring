package com.wubinben.intellij.typeMigration;

public class FromIntToString {
    int f;
    void bar(int i) {}
    void foo() {
        bar(f);
    }
}
