package com.digitalteaching.digitalteaching.list;


import java.util.HashMap;
import java.util.LinkedHashMap;

//Implementing tree using doubly linked list
public class DoublyLinkedList {
    Node head;
    Node tail;
    Node root;

    public Node getRoot() {
        return root;
    }

    public Node addHead(String value) {
        if (getSize() == 0) {
            head = new Node(value);
            root = head;
        }
        else {
            Node temp = new Node(value);
            head.setPrev(temp);
            temp.setNext(head);
            head = temp;
        }
        return head;
    }


    public Node addTail(String value) {

        if (getSize() == 0) {
            tail = new Node(value);
        } else {
            Node node = head;
            while (node != null) {
                if(node.getNext().getNext() == null) {
                    tail = node.getNext();
                    break;
                }
                node= node.getNext();
            }
            Node temp = new Node(value);
            tail.setNext(temp);
            temp.setPrev(tail);
            tail = temp;
        }
        return tail;
    }

    public void removeHead() {
        if (getSize() == 0) {
            System.out.println("\nList is empty.");
            return;
        } else {
            Node temp = head.getNext();
            head.setNext(null);
            temp.setPrev(null);
            head = temp;
        }
    }

    public void removeTail() {
        if (getSize() == 0) {
            System.out.println("\nList is empty.");
            return;
        } else {
            Node temp = tail.getPrev();
            temp.setNext(null);
            tail = temp;
        }
    }

    public int getSize() {
        Node node = head;
        int size = 0;
        while(node!= null) {
            size++;
            node = node.getNext();
        }
        return size;
    }

    public HashMap<Object, Object> getList() {
        Node node = head;
        HashMap<Object, Object> nextChildren = new HashMap<Object, Object>();
        int counter = 1;
        int newCount = 100;
        while(node != null) {
            nextChildren.put(newCount++, node.getValue());
            node = node.getNext();
        }
        return nextChildren;

    }

    LinkedHashMap<Object,Object> map = new LinkedHashMap<Object, Object>();

    public HashMap<Object, Object> getLeftList() {
        Node node = head;
        int counter = 1;
        LinkedHashMap<Object, Object> nextChildren = new LinkedHashMap<Object, Object>();
        while (node.getNext()!=null) {
            nextChildren.put("parent"+counter,node.getPrev().getValue());
            nextChildren.put("child"+counter++, node.getNext().getValue());
            node = node.getNext();
        }
        return nextChildren;
    }

    public HashMap<Object, Object> getRightList() {
        Node node = head;
        LinkedHashMap<Object, Object> nextChildren = new LinkedHashMap<Object, Object>();
        int counter = 1;
        while (node.getNext()!=null && node.getPrev() != null) {
            nextChildren.put("parent"+counter,node.getPrev().getValue());
            nextChildren.put("children"+counter++, node.getNext().getValue());

            node = node.getPrev();
        }
        return nextChildren;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addHead("head");
        list.addHead("new head");
        list.addHead("newer head");
        list.addTail("newest head");
        list.addTail("newest new head");
        System.out.println("Size: " + list.getSize() + "\n");
        System.out.println("\nAfter removing head: ");
        System.out.println(list.getList());
        System.out.println(list.head.getValue());
        System.out.println(list.getRoot().getValue());

    }

}
