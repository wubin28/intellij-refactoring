package com.wubinben.intellij.inline;

import java.util.Comparator;
import java.util.List;

public class InlineToLambdas {
    public class MyComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return 0;
        }
    }

    void sort(List<String> scores) {
        scores.sort(new MyComparator());
    }
}
