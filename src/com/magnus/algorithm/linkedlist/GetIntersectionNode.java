package com.magnus.algorithm.linkedlist;

import com.magnus.algorithm.ListNode;

/**
 * @ClassName GetIntersectionNode
 * @Description 160. 相交链表
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 * @Author yangchuanhua1
 * @Date 2024/9/16 19:45
 */
public class GetIntersectionNode {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }

        return pA;

    }
}
