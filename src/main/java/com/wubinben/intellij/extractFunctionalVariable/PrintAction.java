package com.wubinben.intellij.extractFunctionalVariable;

import java.util.List;
import java.util.function.Function;

public class PrintAction implements Runnable {
    private List<String> data;

    public PrintAction(List<String> data) {
        this.data = data;
    }

    @Override
    public void run() {
        Function<List<String>, String> presenter = p -> "Data: " + p.toString();
        System.out.println(presenter.apply(data));
    }
}
