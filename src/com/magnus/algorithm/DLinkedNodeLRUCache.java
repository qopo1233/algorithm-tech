package com.magnus.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName DLinkedNodeLRUCache
 * @Description 双向循环实现LRU
 * @Author yangchuanhua1
 * @Date 2024/8/18 21:00
 */
public class DLinkedNodeLRUCache {

    class DLinkedNode {

        public int key;

        public int value;

        public DLinkedNode prev;

        public DLinkedNode next;

        public DLinkedNode(int key, int value, DLinkedNode prev, DLinkedNode next) {
            this.key = key;
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

        public DLinkedNode() {
        }
    }


    private Map<Integer, DLinkedNode> cacheMap = new HashMap<>();


    private int capacity;

    private int size;


    private DLinkedNode head;

    private DLinkedNode tail;

    public DLinkedNodeLRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;

        this.head = new DLinkedNode();
        this.tail = new DLinkedNode();

        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public int get(int key) {
        DLinkedNode dLinkedNode = cacheMap.get(key);
        if (dLinkedNode == null) {
            return -1;
        }
        moveToHead(dLinkedNode);
        return dLinkedNode.value;
    }

    /**
     * 放到头部
     * @param dLinkedNode
     */
    private void moveToHead(DLinkedNode dLinkedNode) {
        DLinkedNode prev = dLinkedNode.prev;
        // 在头部就不用移动了
        if (this.head == prev) {
            return;
        }
        removeNode(dLinkedNode);
        addToHead(dLinkedNode);



    }

    public void put(int key, int value) {
        DLinkedNode dLinkedNode = cacheMap.get(key);
        if (dLinkedNode != null) {
            dLinkedNode.value = value;
            moveToHead(dLinkedNode);
            return;
        }
        dLinkedNode = new DLinkedNode();
        dLinkedNode.value = value;
        dLinkedNode.key = key;
        addToHead(dLinkedNode);
        cacheMap.put(key, dLinkedNode);
        size++;
        if (size > capacity) {
            DLinkedNode removeTailDLinkedNode = removeTail();
            cacheMap.remove(removeTailDLinkedNode.key);
            size--;
        }
    }

    private void addToHead(DLinkedNode dLinkedNode) {

        this.head.next.prev = dLinkedNode;
        dLinkedNode.prev = this.head;
        dLinkedNode.next = this.head.next;
        this.head.next = dLinkedNode;
    }

    private DLinkedNode removeTail() {
        DLinkedNode removeDLinkedNode = this.tail.prev;
        removeNode(removeDLinkedNode);
        return removeDLinkedNode;
    }

    public void removeNode(DLinkedNode dLinkedNode) {
        dLinkedNode.prev.next = dLinkedNode.next;
        dLinkedNode.next.prev = dLinkedNode.prev;

        dLinkedNode.next = null;
        dLinkedNode.prev = null;
    }

    public static void main(String[] args) {
        DLinkedNodeLRUCache dLinkedNodeLRUCache = new DLinkedNodeLRUCache(2);

        dLinkedNodeLRUCache.put(1, 1);
        dLinkedNodeLRUCache.put(2, 2);
        dLinkedNodeLRUCache.put(3, 3);

        System.out.println(dLinkedNodeLRUCache);
    }
}
