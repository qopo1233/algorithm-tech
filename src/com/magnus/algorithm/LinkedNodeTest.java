package com.magnus.algorithm;

/**
 * @ClassName ReverseLinkedNode
 * @Description 单链表的操作
 * @Author yangchuanhua1
 * @Date 2024/8/19 14:34
 */
public class LinkedNodeTest {


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode next = new ListNode(2);
        head.next = next;
        next.next = new ListNode(3);
        ListNode listNode = middleNode(head);
        System.out.println(listNode);
    }


    /**
     * 反转单链表
     * @param head
     * @return
     */
    private static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode cursor = head;
        while (cursor != null) {
            ListNode next = cursor.next;
            cursor.next = prev;
            prev = cursor;
            cursor = next;
        }
        return prev;
    }

    /**
     * 是否有环
     * @param head
     * @return
     */
    private static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast.next == null || fast.next.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    /**
     * 合并两个有序的链表
     * @param listNode1
     * @param listNode2
     * @return
     */
    public static ListNode mergeTwoOrderListNode(ListNode listNode1, ListNode listNode2) {
        if (listNode1 == null) {
            return listNode2;
        }
        if (listNode2 == null) {
            return listNode1;
        }

        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        while (listNode1 != null && listNode2 != null) {
            if (listNode1.val <= listNode2.val) {
                p.next = listNode1;
                listNode1 = listNode1.next;
            }else {
                p.next = listNode2;
                listNode2 = listNode2.next;
            }
            p = p.next;
        }
        p.next = listNode1 != null ? listNode1 : listNode2;
        return dummy.next;
    }

    /**
     * 删除第n个节点
     * @param listNode
     * @param n
     */
    public static ListNode removeNLinkedNode(ListNode listNode, int n) {
        ListNode head = listNode;

        ListNode prev = null;
        int i = 1;
        while (i < n) {
            prev = head;
            head = head.next;
            i++;
        }
        if (prev == null) {
            prev = listNode;
            listNode = listNode.next;
            prev.next = null;
            return listNode;
        }
        prev.next = prev.next.next;

        return listNode;

    }

    /**
     * 查找中间节点
     * @param listNode
     * @return
     */
    public static ListNode middleNode(ListNode listNode) {
        ListNode slow = listNode;
        ListNode fast = listNode;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast.next == null) {
                break;
            }
            fast = fast.next;
        }
        return slow;
    }

    public static ListNode deleteNode(ListNode head, int val) {
        ListNode p = head;
        ListNode prev = null;
        while (p.next != null) {
            if (p.val == val) {
                if (prev == null) {
                    head = head.next;
                    return head;
                }
                prev.next = prev.next.next;
            }else {
                prev = p;
                p = p.next;
            }
        }
        return p;

    }
}
