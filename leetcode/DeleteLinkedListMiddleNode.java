package leetcode;

public class DeleteLinkedListMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null || head == null) {
            return null;
        }
        ListNode slowPointer = head;
        ListNode fastPointer = head.next.next;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        slowPointer.next = slowPointer.next.next;

        return head;
    }
}
