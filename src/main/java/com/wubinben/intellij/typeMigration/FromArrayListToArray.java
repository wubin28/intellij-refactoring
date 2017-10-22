package com.wubinben.intellij.typeMigration;

import java.util.ArrayList;

public class FromArrayListToArray {
    private ArrayList<String> myResult;
    public String[] getResult() {
        return myResult.toArray(new String[myResult.size()]);
    }
}
