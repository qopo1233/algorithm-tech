package com.magnus.algorithm.linkedlist;

import com.magnus.algorithm.ListNode;

/**
 * @ClassName ReverseList
 * @Description 链表反转
 * @Author yangchuanhua1
 * @Date 2024/8/7 16:18
 */
public class ReverseList {

    public static void main(String[] args) {

    }

    /**
     * 迭代反转
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

    /**
     * 递归实现
     * @param head
     * @return
     */
    public ListNode reverseListRecursive(ListNode head) {
        // 基本情况：空链表或只有一个节点
        if (head == null || head.next == null) {
            return head;
        }

        // 递归反转剩余链表
        ListNode newHead = reverseListRecursive(head.next);

        // 改变指针方向
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
