package 链表;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class _206_反转链表 {

    /**
     * 迭代法
     * @param head
     * @return
     */
    public ListNode reverseList_method_one(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = null;
        while (head == null) {
            ListNode tmp = head.next;
            head.next = newHead;
            newHead = head;
            head = tmp;
        }
        return newHead;
    }

    /**
     * 递归法
     * @param head
     * @return
     */
    public ListNode reverseList_method_two(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = reverseList_method_two(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
