package 链表;

/**
 * https://leetcode-cn.com/problems/linked-list-cycle/
 */
public class _141_环形链表 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slowPointer = head;
        ListNode fastPointer = head.next;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if (slowPointer == fastPointer) return true;
        }
        return false;
    }
}
