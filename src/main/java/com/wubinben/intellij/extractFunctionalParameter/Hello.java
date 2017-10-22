package com.wubinben.intellij.extractFunctionalParameter;

public class Hello {
    private void printHello(Person person) {
        String s = "Hello";
        person.sayHello(s);
    }
    private void printText () {
        printHello(System.out::println);
    }
}
