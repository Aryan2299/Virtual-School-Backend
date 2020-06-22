package com.digitalteaching.digitalteaching.list;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class NTree {
    NTreeNodes root;

    LinkedHashMap<Object, Object> map = new LinkedHashMap<Object, Object>();
    int counter = 1;

    public void addNewNode(Object parent, ArrayList children) {

        map.put("node" + counter++, new LinkedHashMap<Object, Object>() {{
            put("parent", parent);
            put("children", children);
        }});

    }

    public LinkedHashMap<Object, Object> getNodes() {
        return map;
    }

    public static void main(String[] args) {
    }
}
