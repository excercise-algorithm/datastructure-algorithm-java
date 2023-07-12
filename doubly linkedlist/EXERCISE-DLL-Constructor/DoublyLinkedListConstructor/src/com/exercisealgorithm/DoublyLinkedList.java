package com.exercisealgorithm;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void getHead() {
        if (head == null) {
            System.out.println("head: null");
        } else {
            System.out.println("head: " + head.value);
        }
    }

    public void getTail() {
        if (tail == null) {
            System.out.println("tail: null");
        } else {
            System.out.println("tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("length: " + length);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
