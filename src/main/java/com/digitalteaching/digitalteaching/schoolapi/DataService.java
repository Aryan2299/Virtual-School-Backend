package com.digitalteaching.digitalteaching.schoolapi;

import com.digitalteaching.digitalteaching.list.NTreeTest;
import com.digitalteaching.digitalteaching.list.SchoolTree;
import com.digitalteaching.digitalteaching.list.Test;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DataService {
//    private Data data = new Data();
//    private Test test = new Test();
//
//    private List dataList = new ArrayList(Arrays.asList(
//            data.getTestMap()
//    ));
//
//    public List getAllFolders() {
//        return dataList;
//    }

    NTreeTest test= new NTreeTest();
    Data data = new Data();

    private List dataList = new ArrayList(Arrays.asList(
            data.getTestMap()
    ));

    public List getAllFolders() {
        return dataList;
    }

}

