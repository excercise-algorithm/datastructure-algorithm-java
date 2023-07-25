package io.mars.LeetCode.FindMiddleNode;

public class SolutionTwo {

    public ListNode middleNode(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;

        while (fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        return slowNode;
    }
}
