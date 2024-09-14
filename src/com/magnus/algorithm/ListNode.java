package com.magnus.algorithm;

/**
 * @ClassName ListNode
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/6 16:52
 */
public class ListNode {

    public int val;

    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
