package com.wubinben.intellij.extractMethodObject;

public class Account {
    int gamma (int val1) {
        Calculations calculations = new Calculations().invoke();
        int c = calculations.getC();
        int a = calculations.getA();
        return c-2*a;
    }

    private class Calculations {
        private int c;
        private int a;

        public int getC() {
            return c;
        }

        public int getA() {
            return a;
        }

        public Calculations invoke() {
            c = 0;
            a = 0;
            //some computations
            return this;
        }
    }
}
