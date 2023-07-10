package com.exercisealgorithm;

public class Main {

    public static void main(String[] args) {
        
        LinkedList myLinkedList = new LinkedList(10);
        myLinkedList.append(50);
        myLinkedList.append(40);
        myLinkedList.append(35);

        System.out.println(myLinkedList.get(3).value);

    }
}
