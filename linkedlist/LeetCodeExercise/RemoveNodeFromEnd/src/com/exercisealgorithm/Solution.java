package com.exercisealgorithm;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 0;
        int result;
        ListNode temp = head;
        ListNode temp2 = head;
        ListNode iterator = temp2;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        result = length - n;
        if (result == 0) {
            if (length == 1) {
                return null;
            } else {
                return temp2.next;
            }
        }
        for (int i=0; i < length; i++) {
            if ( i+1 == result) {
                iterator.next = iterator.next.next;
                break;
            }
            iterator = iterator.next;
        }

        return temp2;
    }
}
