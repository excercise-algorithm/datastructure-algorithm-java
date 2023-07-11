package com.exercisealgorithm;

public class Main {

    public static void main(String[] args) {
	ListNode listNode = new ListNode(1, new ListNode(2,
                        new ListNode(3, new ListNode(4,
                        new ListNode(5, new ListNode(6))))));
    Solution solution = new Solution();
    ListNode res = solution.middleNode(listNode);
    while (res != null) {
        System.out.println(res.val);
        res = res.next;
    }
    }
}

