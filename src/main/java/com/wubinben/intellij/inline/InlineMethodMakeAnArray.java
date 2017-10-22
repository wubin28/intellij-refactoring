package com.wubinben.intellij.inline;

import java.util.ArrayList;

public class InlineMethodMakeAnArray {
    public ArrayList method() {
        String[] strings = {"a","b","c"};
        ArrayList list=add(strings);
        return list;
    }

    private ArrayList add(String[] strings) {
        ArrayList list = new ArrayList();
        for (int i=0; i< strings.length; i++)
        {list.add(strings[i]);}
        return list;
    }
}
