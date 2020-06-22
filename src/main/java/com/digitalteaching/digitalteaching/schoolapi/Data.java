package com.digitalteaching.digitalteaching.schoolapi;

import com.digitalteaching.digitalteaching.list.NTreeTest;
import com.digitalteaching.digitalteaching.list.Node;
import com.digitalteaching.digitalteaching.list.SchoolTree;
import com.digitalteaching.digitalteaching.list.Test;

import java.util.HashMap;
import java.util.Hashtable;

public class Data {
    public Data() {

    }
    public Data(NTreeTest test) {
        super();
        this.test = test;
    }
    NTreeTest test = new NTreeTest();

    public NTreeTest getTest() {
        return test;
    }

    public void setTest(NTreeTest test) {
        this.test = test;
    }

    public HashMap<Object, Object> getTestMap() {
        return testMap;
    }

    public void setTestMap(HashMap<Object, Object> testMap) {
        this.testMap = testMap;
    }

    private HashMap<Object, Object> testMap = new HashMap<Object, Object>() {{
        put("school", test.getTest());
    }};


//    public Test getTest() {
//        return test;
//    }
//
//    public void setTest(Test test) {
//        this.test = test;
//    }
//
//    public HashMap<Object, Object> getTestMap() {
//        return testMap;
//    }
//
//    public void setTestMap(HashMap<Object, Object> testMap) {
//        this.testMap = testMap;
//    }
//
//    private Test test = new Test();
//    private HashMap<Object, Object> testMap = new HashMap<Object, Object>() {{
//        put("school", test.getTree());
//    }};

}
