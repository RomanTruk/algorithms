package leetcode;

public class MaximumTwinSumOfLinkedList {
    public int pairSum(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        ListNode prev = null;
        ListNode nextNode;
        while (slowPointer != null) {
            nextNode = slowPointer.next;
            slowPointer.next = prev;
            prev = slowPointer;
            slowPointer = nextNode;
        }

        int maxSum = 0;
        ListNode first = head;
        while (prev != null) {
            maxSum = Math.max(maxSum, first.val + prev.val);
            prev = prev.next;
            first = first.next;
        }

        return maxSum;
    }
}
