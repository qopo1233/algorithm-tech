package com.magnus.algorithm.linkedlist;

import com.magnus.algorithm.ListNode;
import com.magnus.algorithm.Node;

/**
 * @ClassName LinkedList
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/18 16:07
 */
public class LinkedList {


    public static void main(String[] args) {

    }


    /**
     * 删除节点元素-递归 203
     * @param head
     * @param value
     */
    public ListNode removeElement1(ListNode head, int value) {
        if (head == null) {
            return head;
        }
        head.next = removeElement1(head.next, value);
        return head.val == value ? head.next : head;
    }

    /**
     * 删除节点元素-循环-设置哑节点比较好，代码量少。
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode = new ListNode(0);// 哑节点
        dummyNode.next = head;
        ListNode cur = dummyNode;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return dummyNode.next;
    }
}
