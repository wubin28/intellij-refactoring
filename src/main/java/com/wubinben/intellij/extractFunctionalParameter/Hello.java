package com.wubinben.intellij.extractFunctionalParameter;

public class Hello {
    private void printHello () {
        String s="Hello";
        System.out.println(s);
    }
    private void printText () {
        printHello();
    }
}
