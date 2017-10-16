package com.wubinben.intellij.convertAnonymousToInner;

public class Class {
    public Interface method() {
        final int i = 0;
        return new MyInterfaceClass(i);
    }

    private class MyInterfaceClass implements Interface {
        private final int i;

        public MyInterfaceClass(int i) {
            this.i = i;
        }

        public int publicMethod() {
            return i;
        }
    }
}
