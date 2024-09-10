package com.magnus.algorithm;

/**
 * @ClassName SingleLinkedNode
 * @Description 单链表节点
 * @Author yangchuanhua1
 * @Date 2024/8/19 10:28
 */
public class SingleLinkedNode<T> {

    private T data;

    private SingleLinkedNode<T> next;

    public SingleLinkedNode(T data, SingleLinkedNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public SingleLinkedNode(T data) {
        this.data = data;
    }

    public SingleLinkedNode() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public SingleLinkedNode<T> getNext() {
        return next;
    }

    public void setNext(SingleLinkedNode<T> next) {
        this.next = next;
    }
}
