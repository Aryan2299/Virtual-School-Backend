package com.digitalteaching.digitalteaching.list;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test {
    private SchoolTree simpleTree = new SchoolTree();


    public LinkedHashMap<Object, Object> getTree() {

        DoublyLinkedList list = new DoublyLinkedList();

        Node root = new Node("Teacher 1");

        list.head = root;
        //Left children
        Node folderLeft = new Node("Folder Left");
        Node sub1Left = new Node("Subject 1 Left");
        Node sub2Left = new Node("Subject 2 Left");
        Node s1l1Left = new Node("Subject 1, Lesson 1 Left");
        Node s1l2Left = new Node("Subject 1, Lesson 2 Left");
        Node s2l1Right = new Node("Subject 2, Lesson 1 Left sibling");
        Node s2l2Right = new Node("Subject 2, Lesson 2 Left sibling");
        Node mod1Left = new Node("Module 1 Left");
        Node mod2Left = new Node("Module 1 Left sibling");
        Node work1Left = new Node("Workbook 1 Left");
        Node work2Left = new Node("Workbook 1 Left sibling");

        //Right children
        Node folderRight = new Node("Folder Right");
        Node sub1Right = new Node("Subject 1 Right");
        Node sub2Right = new Node("Subject 2 Right");
        Node s1less1Left = new Node("Subject 1, Lesson 1 Right");
        Node s1less2Left = new Node("Subject 1, Lesson 2 Right");
        Node s2less1Right = new Node("Subject 2, Lesson 1 Right sibling");
        Node s2less2Right = new Node("Subject 2, Lesson 2 Right sibling");
        Node mod1Right = new Node("Module 1 Right");
        Node mod2Right = new Node("Module 1 Right sibling");
        Node work1Right = new Node("Workbook 1 Right");
        Node work2Right = new Node("Workbook 1 Right sibling");


        LinkedHashMap<Object, Object> map = new LinkedHashMap<Object, Object>();

        simpleTree.addChildren(list.head, folderLeft, folderRight);
        //Left children
        simpleTree.addChildren(folderLeft, sub1Left, sub2Left);
        simpleTree.addChildren(sub1Left, s1l1Left, s1l2Left);
        simpleTree.addChildren(sub2Left, s2l1Right, s2l2Right);
        simpleTree.addChildren(s1l1Left, mod1Left);
        simpleTree.addChildren(s1l2Left, mod2Left);
        simpleTree.addChildren(mod1Left, work1Left);
        simpleTree.addChildren(mod2Left, work2Left);

        //Right children
        simpleTree.addChildren(folderRight, sub1Right, sub2Right);
        simpleTree.addChildren(sub1Right, s1less1Left, s1less2Left);
        simpleTree.addChildren(sub2Right, s2less1Right, s2less2Right);
        simpleTree.addChildren(s2less1Right, mod1Right);
        simpleTree.addChildren(s2less2Right, mod2Right);
        simpleTree.addChildren(mod1Right, work1Right);
        simpleTree.addChildren(mod2Right, work2Right);

        int counter = 1;

//        map.put("left",list.getLeftList());
//        map.put("right",list.getRightList());


//        Adding left children
        map.put(list.head.getValue() , simpleTree.getChildren(list.head));
        map.put(list.head.getNext().getValue(), simpleTree.getChildren(list.head.getPrev()));
        map.put(list.head.getNext().getValue() , simpleTree.getChildren(list.head.getNext()));
        map.put(list.head.getNext().getPrev().getValue(), simpleTree.getChildren(list.head.getNext().getPrev()));
        map.put(list.head.getNext().getNext().getValue() , simpleTree.getChildren(list.head.getNext().getNext()));
        map.put(list.head.getNext().getNext().getPrev().getValue() , simpleTree.getChildren(list.head.getNext().getNext().getPrev()));
        map.put(list.head.getNext().getNext().getNext().getValue() , simpleTree.getChildren(list.head.getNext().getNext().getNext()));
//        map.put("last right", simpleTree.getChildren(list.head.getNext().getNext().getNext().getNext()));

        //Adding right children
        map.put(list.head.getValue(), simpleTree.getChildren(list.head));
        map.put(list.head.getPrev().getValue() , simpleTree.getChildren(list.head.getPrev()));
        map.put(list.head.getPrev().getPrev().getValue(), simpleTree.getChildren(list.head.getPrev().getPrev()));
        map.put(list.head.getPrev().getNext().getValue() , simpleTree.getChildren(list.head.getPrev().getNext()));
        map.put(list.head.getPrev().getPrev().getPrev().getValue() , simpleTree.getChildren(list.head.getPrev().getPrev().getPrev()));
        map.put(list.head.getPrev().getPrev().getNext().getValue() , simpleTree.getChildren(list.head.getPrev().getPrev().getNext()));
//        map.put("last left", simpleTree.getChildren(list.head.getPrev().getPrev().getPrev().getNext()));

        return map;
    }

    public static void main(String[] args) {
        Test newTest = new Test();
        System.out.println(newTest.getTree());

    }

}
