package com.magnus.algorithm;

/**
 * @ClassName JudgeLinkedStringIsP
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/19 10:27
 */
public class JudgeLinkedStringIsPalindrome {


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

        System.out.println(judgeIsPalindrome(linkedString));

    }

    public static boolean judgeIsPalindrome(LinkedString linkedString) {
        SingleLinkedNode<Character> slow = linkedString.getHead();
        SingleLinkedNode<Character> fast = linkedString.getHead();
        int index = 1;
        while (fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext();
            if (fast.getNext() == null) {
                break;
            }
            fast = fast.getNext();
            index++;
        }
        System.out.println("中间节点的位置为:" + index);
        LinkedString linkedString1 = reverseLinedString(linkedString, index);
        System.out.println("反转之前的链表:" + linkedString.getString());
        System.out.println("反转之后的链表:" + linkedString1.getString());

        SingleLinkedNode<Character> head = linkedString.getHead();
        SingleLinkedNode<Character> head1 = linkedString1.getHead();

        for (int i = 1; i <= index; i++) {
            if (!head.getData().equals(head1.getData())) {
                System.out.println("不是回文字符串");
                return false;
            }
            head1 = head1.getNext();
            head = head.getNext();
        }
        System.out.println("是回文字符串");
        return true;

    }




    /**
     * 从index
     * @param linkedString
     * @param index
     * @return
     */
    public static LinkedString reverseLinedString(LinkedString linkedString, int index) {

        SingleLinkedNode<Character> head = linkedString.getHead();
        int temp = 1;

        SingleLinkedNode<Character> mid = head;
        while (temp < index) {
            mid = mid.getNext();
            temp++;
        }

        SingleLinkedNode<Character> prev = mid;


        SingleLinkedNode<Character> cursor = mid.getNext();
        mid.setNext(null);
        while (cursor != null) {
            SingleLinkedNode<Character> next = cursor.getNext();
            cursor.setNext(prev);
            prev = cursor;
            cursor = next;
        }

        LinkedString linkedString1 = new LinkedString();
        linkedString1.addLinkedNode(prev);
        return linkedString1;

    }


}
