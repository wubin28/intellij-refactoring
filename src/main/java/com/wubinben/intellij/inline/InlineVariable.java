package com.wubinben.intellij.inline;

public class InlineVariable {
    private AnotherClass anotherClass;
    private int a;

    public void method() {
        int b = a + anotherClass.intValue();

        int a = anotherClass.innerClass.i;
    }

    private class AnotherClass {

        public InnerClass innerClass;

        public int intValue() {
            return 0;
        }

        private class InnerClass {

            public int i;
        }
    }
}
