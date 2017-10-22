package com.wubinben.intellij.inline;

import java.util.List;

public class InlineToLambdas {

    void sort(List<String> scores) {
        scores.sort((s1, s2) -> 0);
    }
}
