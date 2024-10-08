package com.magnus.algorithm.linkedlist;

import com.magnus.algorithm.ListNode;

/**
 * @ClassName ReverseList
 * @Description
 * @Author yangchuanhua1
 * @Date 2024/8/7 16:18
 */
public class ReverseList {

    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode reverseList1(ListNode head) {
        return null;
    }
}
