package io.mars.LeetCode.FindMiddleNode;

public class SolutionOne {

    public ListNode middleNode(ListNode head) {
        int middle = getMiddleNodeIndex(head);
        return getMiddleNode(head, middle);
    }

    private int getMiddleNodeIndex(ListNode head){
        int lengthList = 0;
        int secondNode = 0;

        while(head != null){
            head = head.next;
            lengthList++;
        }

        int middleNode = lengthList /2;
        if (lengthList%2 == 0) middleNode += secondNode;

        return middleNode;
    }

    private ListNode getMiddleNode(ListNode head, int index){
        for (int i = 0; i < index; i++){
            head = head.next;
        }
        return head;
    }
}
