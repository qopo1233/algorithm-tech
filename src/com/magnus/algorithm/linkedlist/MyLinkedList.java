package com.magnus.algorithm.linkedlist;

import com.magnus.algorithm.ListNode;

/**
 * @ClassName MyLinkedList
 * @Description 707 设计链表
 * 你可以选择使用单链表或者双链表，设计并实现自己的链表。
 *
 * 单链表中的节点应该具备两个属性：val 和 next 。val 是当前节点的值，next 是指向下一个节点的指针/引用。
 *
 * 如果是双向链表，则还需要属性 prev 以指示链表中的上一个节点。假设链表中的所有节点下标从 0 开始。
 *
 * 实现 MyLinkedList 类：
 *
 * MyLinkedList() 初始化 MyLinkedList 对象。
 * int get(int index) 获取链表中下标为 index 的节点的值。如果下标无效，则返回 -1 。
 * void addAtHead(int val) 将一个值为 val 的节点插入到链表中第一个元素之前。在插入完成后，新节点会成为链表的第一个节点。
 * void addAtTail(int val) 将一个值为 val 的节点追加到链表中作为链表的最后一个元素。
 * void addAtIndex(int index, int val) 将一个值为 val 的节点插入到链表中下标为 index 的节点之前。如果 index 等于链表的长度，那么该节点会被追加到链表的末尾。如果 index 比长度更大，该节点将 不会插入 到链表中。
 * void deleteAtIndex(int index) 如果下标有效，则删除链表中下标为 index 的节点。
 * @Author yangchuanhua1
 * @Date 2024/9/14 08:18
 */
public class MyLinkedList {


    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(2);
        myLinkedList.deleteAtIndex(1);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(3);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(5);
        myLinkedList.addAtTail(5);
        myLinkedList.get(5);
        myLinkedList.deleteAtIndex(6);
        myLinkedList.deleteAtIndex(4);
        // 5->2->3->7->2->2->5
    }

    private Node head;

    private int length;
    public MyLinkedList() {
        this.length = 0;
    }


    public int get(int index) {
        if (length < 0) {
            return -1;
        }
        if (index >= length) {
            return -1;
        }
        Node cur = head;
        for (int i = 0; i < length; i++) {
            if (i == index) {
               break;
            }else {
                cur = cur.next;
            }
        }

        return cur.val;
    }

    public void addAtHead(int val) {
        if (head == null) {
            head = new Node(val);
        }else {
            Node node = new Node(val);
            node.next = head;
            head = node;
        }
        length++;
    }

    public void addAtTail(int val) {
        if (head == null) {
            head = new Node(val);
        }else {
            Node node = new Node(val);
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
        length++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0) {
            return;
        }
        if (index > length) {
            return;
        }
        if (index == length) {
            this.addAtTail(val);
        }else {
            if (index == 0) {
                this.addAtHead(val);
                return;
            }
            Node cur = head;
            int i = 1;
            while (i < index) {
                cur = cur.next;
                i++;
            }
            Node node = new Node(val);
            node.next = cur.next;
            cur.next = node;
            length++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0) {
            return;
        }
        if (index > length - 1) {
            return;
        }
        if (index == 0) {
            if (head == null) {
                return;
            }
            head = head.next;
            length--;
            return;
        }
        int i = 1;
        Node cur = head;
        while (i < index) {
            cur = cur.next;
            i++;
        }
        cur.next = cur.next.next;
        length--;
    }

}

class Node {
    public int val;

    public Node next;

    public Node(int val) {
        this.val = val;
    }


}