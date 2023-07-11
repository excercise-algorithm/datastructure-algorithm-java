package com.exercisealgorithm;

class Solution {
    public ListNode middleNode(ListNode head) {
        int average = getLength(head);
        int middle = average/2;
        return result(head, average, middle);
    }

    private int getLength(ListNode listNode) {
        int length = 0;
        while (listNode != null) {
            listNode = listNode.next;
            length ++;
        }
        return length;
    }

    private ListNode result(ListNode listNode, int length, int middle) {
        ListNode temp = null;
        for (int i = 0; i < length; i++) {
            if ( middle == i) {
                temp = listNode;
            }
            listNode = listNode.next;
        }
        return temp;
    }
}
