package com.codegym.data_structure_and_basic_algorithm.linkedList;

public class Node {
    public Node next;
    public Object data;

    public Node(Object data) {
        this.data=data;
        this.next=null;
    }
    public Object getData() {
        return this.data;
    }
}
