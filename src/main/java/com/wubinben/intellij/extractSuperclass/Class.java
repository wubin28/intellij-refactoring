package com.wubinben.intellij.extractSuperclass;

public class Class {
    public static final int CONSTANT = 0;
    private double varDouble;

    public void publicMethod() {
        //...
    }

    public void setVarDouble(double var) {
        this.varDouble = var;
    }

    public double getVarDouble() {
        return varDouble;
    }
}
