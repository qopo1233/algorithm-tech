package com.magnus.algorithm.linkedlist;

import com.magnus.algorithm.ListNode;

/**
 * @ClassName SwapPairs
 * @Description 24 两两交换链表中的节点
 * @Author yangchuanhua1
 * @Date 2024/9/14 13:41
 */
public class SwapPairs {


    public static void main(String[] args) {

    }
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode cur = dummyNode;
        while (cur.next != null && cur.next.next != null) {
            ListNode a = cur.next;
            ListNode b = cur.next.next;
            cur.next = b;
            a.next = b.next;
            b.next = a;
            cur = a;
        }

        return dummyNode.next;
    }
}
