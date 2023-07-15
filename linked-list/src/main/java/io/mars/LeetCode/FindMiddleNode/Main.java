package io.mars.LeetCode.FindMiddleNode;

public class Main {
    public static void main(String[] args) {
        ListNode LinkedListOne = new ListNode(1, new ListNode(2,
                                 new ListNode(3, new ListNode(4,
                                 new ListNode(5, new ListNode(6))))));

        SolutionOne solution = new SolutionOne();
        SolutionTwo solutionTwo = new SolutionTwo();

        System.out.println(solution.middleNode(LinkedListOne).value);
        System.out.println(solutionTwo.middleNode(LinkedListOne).value);
    }

}