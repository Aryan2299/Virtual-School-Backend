package com.digitalteaching.digitalteaching.list;

public class Node {
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    private String value;
    private Node next;
    private Node prev;

    Node(String value, Node next) {
        super();
        this.value = value;
        this.next = next;
    }

    Node(String value, Node next, Node prev) {
        super();
        this.value = value;
        this.next = next;
        this.next = next;
    }

    Node(String value) {
        super();
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    Node() {
        this.value = "";
        this.next = null;
        this.prev = null;
    }

}
