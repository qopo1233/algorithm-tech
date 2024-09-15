package com.magnus.algorithm.linkedlist;

import com.magnus.algorithm.LinkedString;
import com.magnus.algorithm.ListNode;

/**
 * @ClassName RemoveNthFromEnd
 * @Description 19. 删除链表的倒数第 N 个结点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * @Author yangchuanhua1
 * @Date 2024/9/15 08:26
 */
public class RemoveNthFromEnd {

    public static void main(String[] args) {

    }

    /**
     * 删除倒数第 N 个节点
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode slow = dummyNode;
        ListNode fast = dummyNode;

        for (int i = 1; i < n; i++) {
            fast = fast.next;
        }

        ListNode pre = dummyNode;
        while (fast.next != null) {
            pre = slow;
            fast = fast.next;
            slow = slow.next;
        }

        pre.next = slow.next;

        return dummyNode.next;

    }
}
