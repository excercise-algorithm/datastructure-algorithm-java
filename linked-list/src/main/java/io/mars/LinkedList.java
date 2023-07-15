package io.mars;

public class LinkedList <T> {

    private Node<T> head;
    private Node<T> tail;
    private int length;

    static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    public LinkedList(T value) {
        Node<T> node = make(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void print() {
        Node<T> current= head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(T value) {
        Node<T> node = make(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        length++;
    }

    public Node<T> removeLast() {
        if (length == 0) return null;
        Node<T> current = head;
        Node<T> pre = head;
        while(current.next != null) {
            pre = current;
            current = current.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return current;
    }

    public void prepend(T value) {
        Node<T> node = make(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        length++;
    }

    public Node<T> removeFirst() {
        if (length == 0) return null;
        Node<T> current = head;
        head = head.next;
        current.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return current;
    }

    public Node<T> get(int index) {
        if (index < 0 || index >= length) return null;
        Node<T> current = head;
        for(int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public boolean set(int index, T value) {
        Node<T> current = get(index);
        if (current != null) {
            current.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, T value)  {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node<T> node = new Node<>(value);
        Node<T> current = get(index - 1);
        node.next = current.next;
        current.next = node;
        length++;
        return true;
    }

    public Node<T> remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        Node<T> prev = get(index - 1);
        Node<T> current = prev.next;

        prev.next = current.next;
        current.next = null;
        length--;
        return current;
    }

    public void reverse() {
        Node<T> current = head;
        head = tail;
        tail = current;
        Node<T> after, before = null;
        for (int i = 0; i < length; i++) {
            after = current.next;
            current.next = before;
            before = current;
            current = after;
        }
    }

    private Node<T> make(T value){
        return new Node<>(value);
    }

}

