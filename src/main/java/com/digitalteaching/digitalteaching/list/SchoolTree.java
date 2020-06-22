package com.digitalteaching.digitalteaching.list;

import java.util.HashMap;

public class SchoolTree {
    DoublyLinkedList list = new DoublyLinkedList();

    Node root = new Node();

    public HashMap<Object, Object> addChildren(Node parent, Node left) {
//        parent.setNext(left);
        parent.setPrev(left);
        DoublyLinkedList newList = new DoublyLinkedList();
        newList.addHead(left.getValue());
        newList.addHead(parent.getValue());

        return newList.getList();
    }

    public HashMap<Object, Object> addChildren(Node parent, Node left, Node right) {

//        parent.setNext(left);
//        parent.setPrev(right);
        parent.setPrev(left);
        parent.setNext(right);
        DoublyLinkedList newList = new DoublyLinkedList();
        newList.addHead(right.getValue());
        newList.addHead(left.getValue());
        newList.addHead(parent.getValue());

        return newList.getList();
    }

    public HashMap<String, Object> getChildren(Node parent) {

        HashMap<String, Object> map = new HashMap<String, Object>() {{
            put("parent", parent.getValue());
            if (parent.getPrev() != null) {put("left", parent.getPrev().getValue());} else {
                put("left", parent.getPrev());
            }
            if (parent.getNext() != null) {put("right", parent.getNext().getValue());} else {
                put("right", parent.getNext());
            }

        }};

        return map;
    }


    public static void main(String[] args) {
//        SchoolTree simpleTree = new SchoolTree();
//        Node root = new Node("Teacher 1");
//
//        //Left children
//        Node folderLeft = new Node("Folder Left");
//        Node sub1L = new Node("English");
//        Node sub2L = new Node("Maths");
//        Node less1LL = new Node("English, Lesson 1");
//        Node less2LL = new Node("English, Lesson 2");
//        Node less1LR = new Node("Maths, Lesson 1");
//        Node less2LR = new Node("Maths, Lesson 2");
//
//        //Right children
//        Node sub1R = new Node("Physics");
//        Node sub2R = new Node("Chemistry");
//        Node less1RR = new Node("Physics, Lesson 1");
//        Node less2RR = new Node("Physics, Lesson 2");
//        Node less1RL = new Node("Chemistry, Lesson 1");
//        Node less2RL = new Node("Chemistry, Lesson 2");
//
//
//        Node folderRight = new Node("Folder Right");
//
//        //Add folders
//        simpleTree.addChildren(root, folderLeft, folderRight);
//
//        //Add children to left folder
//        simpleTree.addChildren(folderLeft, sub1L, sub2L);
//        simpleTree.addChildren(sub1L, less1LL, less2LL);
//        simpleTree.addChildren(sub2L, less1LR, less2LR);
//
//
//        //Add children to right folder
//        simpleTree.addChildren(folderLeft, sub1R, sub2R);
//        simpleTree.addChildren(sub1R, less1RR, less2RR);
//        simpleTree.addChildren(sub2R, less1RL, less2RL);
//
//
//        System.out.println(simpleTree.getChildren(root));
//        System.out.println(simpleTree.getChildren(folderLeft));
//        System.out.println(simpleTree.getChildren(sub1L));
//        System.out.println(simpleTree.getChildren(sub2L));
//
//        System.out.println(simpleTree.getChildren(folderRight));
//        System.out.println(simpleTree.getChildren(sub1R));
//        System.out.println(simpleTree.getChildren(sub2R));
    }
}
