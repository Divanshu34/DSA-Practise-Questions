package com.leetcode.easy;

public class MergeTwoLinkedLists {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        }

        ListNode travA = a;
        ListNode travB = b;
        ListNode x = new ListNode();
        ListNode travX = x;
        while (travA != null || travB != null) {
            if (travA != null && travA.val <= travB.val) {
                travX.val = travA.val;
                travA = travA.next;
            } else if (travB != null) {
                travX.val = travB.val;
                travB = travB.next;
            }
            travX.next = new ListNode();
            travX = travX.next;
        }
        if (x == null)
            return null;
        if (x.next == null)
            return null;
        travX = x;
        while (travX.next.next != null) {
            travX = travX.next;
        }
        travX.next = null;
        return x;
    }

    public ListNode mergeTwoLists1(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (a != null && b != null) {
            if (a.val < b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        if (a != null) {
            tail.next = a;
        } else {
            tail.next = b;
        }

        return dummy.next;
    }
}
