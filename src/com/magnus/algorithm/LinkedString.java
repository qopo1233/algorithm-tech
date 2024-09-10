package com.magnus.algorithm;

/**
 * @ClassName LinkedString
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/19 10:29
 */
public class LinkedString {

    private SingleLinkedNode<Character> head;


    public LinkedString() {
    }

    public SingleLinkedNode<Character> getHead() {
        return head;
    }

    public void addLinkedNode(SingleLinkedNode<Character> singleLinkedNode) {
        if (head == null) {
            head = new SingleLinkedNode<>();
            head.setData(singleLinkedNode.getData());
            head.setNext(singleLinkedNode.getNext());
            return;
        }
        SingleLinkedNode<Character> cursor = head;
        while (cursor.getNext() != null) {
            cursor = cursor.getNext();
        }
        SingleLinkedNode<Character> next = new SingleLinkedNode<>(singleLinkedNode.getData());
        next.setNext(singleLinkedNode.getNext());
        cursor.setNext(next);
    }

    public String getString() {
        if (head == null) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder(head.getData());
        SingleLinkedNode<Character> cursor = head;
        while (cursor != null) {
            stringBuilder.append(cursor.getData());
            cursor = cursor.getNext();
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        LinkedString linkedString = new LinkedString();

        linkedString.addLinkedNode(new SingleLinkedNode<>('h'));
        linkedString.addLinkedNode(new SingleLinkedNode<>('e'));
        linkedString.addLinkedNode(new SingleLinkedNode<>('l'));
        linkedString.addLinkedNode(new SingleLinkedNode<>('l'));
        linkedString.addLinkedNode(new SingleLinkedNode<>('o'));
        linkedString.addLinkedNode(new SingleLinkedNode<>(' '));
        linkedString.addLinkedNode(new SingleLinkedNode<>('w'));
        linkedString.addLinkedNode(new SingleLinkedNode<>('o'));
        linkedString.addLinkedNode(new SingleLinkedNode<>('r'));
        linkedString.addLinkedNode(new SingleLinkedNode<>('l'));
        linkedString.addLinkedNode(new SingleLinkedNode<>('d'));
        linkedString.addLinkedNode(new SingleLinkedNode<>('!'));

        System.out.println(linkedString.getString());

    }
}
