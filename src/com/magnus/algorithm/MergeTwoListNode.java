package com.magnus.algorithm;

import java.util.Objects;

/**
 * @ClassName MergeTwoListNode
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/6 16:52
 */
public class MergeTwoListNode {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        ListNode listNode = mergeTwoListNode3(l1, l2);
        while (Objects.nonNull(listNode)) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode mergeTwoListNode(ListNode l1, ListNode l2) {
        if (Objects.isNull(l1)) {
            return l2;
        }else if (Objects.isNull(l2)) {
            return l1;
        }else if (l1.val < l2.val) {
            l1.next = mergeTwoListNode(l1.next, l2);
            return l1;
        }else {
            l2.next = mergeTwoListNode(l1, l2.next);
            return l2;
        }
    }

    public static ListNode mergeTwoListNode2(ListNode list1, ListNode list2) {
            if (list1 == null) {
                return list2;
            }
            if (list2 == null) {
                return list1;
            }
            ListNode head = new ListNode();
            ListNode p = head;
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    p.val = list1.val;
                    list1 = list1.next;
                }else{
                    p.val = list2.val;
                    list2 = list2.next;
                }
                if (list1 != null && list2 != null) {
                    p.next = new ListNode();
                    p = p.next;
                }

            }
            if(list1 != null) {
                p.next = list1;
            }

            if(list2 != null) {
                p.next = list2;
            }

            return head;
        }

    public static ListNode mergeTwoListNode3(ListNode l1, ListNode l2) {
        if (Objects.isNull(l1)) {
            return l2;
        }
        if (Objects.isNull(l2)) {
            return l1;
        }
        ListNode head = new ListNode();
        ListNode p = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        p.next = l1 != null ? l1 : l2;
        return head.next;
    }
}
