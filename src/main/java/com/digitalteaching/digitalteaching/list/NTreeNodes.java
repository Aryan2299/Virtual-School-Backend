package com.digitalteaching.digitalteaching.list;

import java.util.ArrayList;

public class NTreeNodes {
    NTreeNodes(Object parent, ArrayList children) {
        super();
        this.parent = parent;
        this.children = children;
    }

    public Object getParent() {
        return parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    public ArrayList<NTreeNodes> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<NTreeNodes> children) {
        this.children = children;
    }

    Object parent;
    ArrayList<NTreeNodes> children = new ArrayList<>();
}
