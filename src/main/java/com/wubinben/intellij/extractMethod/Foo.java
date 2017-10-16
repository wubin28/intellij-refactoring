package com.wubinben.intellij.extractMethod;

import java.util.ArrayList;

public class Foo {
    public void method() {
        int a = 1;
        int b = 2;
        int c = add(a, b);
        int d = add(a, c);
    }

    private int add(int a, int b) {
        return a + b;
    }

    public ArrayList method2() {
        String[] strings = {"a", "b", "c"};
        ArrayList list = new ArrayList();
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i]);
        }
        return list;
    }
}
