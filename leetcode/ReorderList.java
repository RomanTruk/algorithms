package leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }

        ListNode middleNode = findMiddleNode(head);
        ListNode secondHalf = reverse(middleNode.next);
        middleNode.next = null;

        ListNode p1 = head;
        ListNode p2 = secondHalf;

        while (p2 != null) {
            ListNode tmp1 = p1.next;
            ListNode tmp2 = p2.next;

            p1.next = p2;
            p2.next = tmp1;

            p1 = tmp1;
            p2 = tmp2;
        }
    }

    private ListNode findMiddleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
