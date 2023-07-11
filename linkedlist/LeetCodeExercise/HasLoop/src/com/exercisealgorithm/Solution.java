package com.exercisealgorithm;

class Solution {
    public boolean hasCycle(ListNode head, int pos) {
        int length = 0;
        while (head != null) {
            if (length == pos) return true;
            head = head.next;
            length++;
        }
        return false;
    }
}
