package com.wubinben.intellij.extractFunctionalVariable;

import java.util.List;

public class PrintAction implements Runnable {
    private List<String> data;

    public PrintAction(List<String> data) {
        this.data = data;
    }

    @Override
    public void run() {
        System.out.println("Data: " + data.toString());
    }
}
