package 链表;

/**
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 */
public class _237_删除链表中的节点 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    /**
     * https://leetcode-cn.com/problems/middle-of-the-linked-list/
     */
    public static class _链表的中间结点 {
    }
}
