package com.magnus.algorithm;

import java.util.List;

/**
 * @ClassName ListNodeHasCycle
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/6 17:46
 */
public class ListNodeHasCycle {

    public static boolean hasCycle(ListNode head) {
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
}
