package com.exercisealgorithm;

public class Main {

    public static void main(String[] args) {
	ListNode listNode = new ListNode(3, new ListNode(2,
                        new ListNode(0, new ListNode(-4))));
    Solution solution = new Solution();
    boolean res = solution.hasCycle(listNode, 1);
    System.out.println(res);
    }
}

