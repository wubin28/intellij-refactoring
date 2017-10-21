package com.wubinben.intellij.extractParameter.delegateViaOverloadingMethod;

public class HelloWorldPrinter {
    public static void print() {
        System.out.println(generateText());
    }
    private static String generateText() {
        return "Hello, World!".toUpperCase();
    }
}
