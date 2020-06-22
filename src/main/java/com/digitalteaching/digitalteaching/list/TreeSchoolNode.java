package com.digitalteaching.digitalteaching.list;

import java.util.ArrayList;

public class TreeSchoolNode {
    public TreeSchoolNode(String data) {
        super();
        this.data = data;
    }

    public TreeSchoolNode(String data, ArrayList nodesArray) {
        super();
        this.data = data;
        this.nodesArray = nodesArray;
    }
    String data;
    ArrayList nodesArray = new ArrayList();
}
