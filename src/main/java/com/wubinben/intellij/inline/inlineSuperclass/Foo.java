package com.wubinben.intellij.inline.inlineSuperclass;

public class Foo extends Bar {
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
}
