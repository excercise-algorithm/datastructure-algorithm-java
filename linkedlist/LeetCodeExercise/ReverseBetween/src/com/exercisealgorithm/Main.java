package com.exercisealgorithm;

public class Main {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2,
                            new ListNode(3, new ListNode(4,
                            new ListNode(5)))));
        Solution solution = new Solution();
        ListNode res = solution.reverseBetween(listNode, 2, 4);


//    ListNode res = solution.removeNthFromEnd(listNode, 2);
    while(res != null) {
        System.out.println(res.val);
        res = res.next;
    }
//    System.out.println(res);
//    }
    }
}

