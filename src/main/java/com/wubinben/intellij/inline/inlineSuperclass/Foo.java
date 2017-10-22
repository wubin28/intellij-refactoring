package com.wubinben.intellij.inline.inlineSuperclass;

public class Foo {
    private int something;

    int someMethod() {
        //...
        if (something > calculations1()) {
            //...
            return calculations2();
        }
        //...
        return 0;
    }

    //...
    int calculations1() {
        //...
        return 0;
    }

    int calculations2() {
        //...
        return 0;
    }
}
