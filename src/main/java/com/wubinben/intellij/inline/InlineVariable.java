package com.wubinben.intellij.inline;

public class InlineVariable {
    private AnotherClass anotherClass;
    private int a;

    public void method() {
        int number = anotherClass.intValue();
        int b = a + number;

        AnotherClass.InnerClass aClass = anotherClass.innerClass;
        int a = aClass.i;
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
