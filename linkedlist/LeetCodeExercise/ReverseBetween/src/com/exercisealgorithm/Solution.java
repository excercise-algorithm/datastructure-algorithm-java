package com.exercisealgorithm;

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(0); // created dummy node
        dummy.next = head;
        ListNode prev = dummy; // intialising prev pointer on dummy node

        for(int i = 1; i < left ; i++)
            prev = prev.next; // adjusting the prev pointer on it's actual index

        ListNode curr = prev.next; // curr pointer will be just after prev
        // reversing
        for(int i = 0; i < right - left; i++){
            ListNode forw = curr.next; // forw pointer will be after curr
            curr.next = forw.next;
            forw.next = prev.next;
            prev.next = forw;
        }
        return dummy.next;



//        ListNode temp = head;
//        ListNode leftNode = temp;
//        ListNode rightNode = temp;
//        ListNode counter = new ListNode(0);
//        ListNode before = leftNode;
//        for (int i = 1; i < right ; i++) {
//            rightNode = rightNode.next;
//        }
//        for (int i = 1; i < left; i++) {
//            leftNode = leftNode.next;
//        }
//        counter.next = leftNode;
//        while (counter != rightNode) {
//            ListNode after = counter.next;
//            counter.next = before;
//            before = counter;
//            counter = after;
//        }
//        return temp;
    }
}
