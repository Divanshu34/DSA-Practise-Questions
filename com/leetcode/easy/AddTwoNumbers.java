package com.leetcode.easy;

class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode() {
    }

}

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode trav1 = l1;
        ListNode trav2 = l2;
        ListNode sum = new ListNode();
        ListNode travSum = sum;
        int count = 0;
        ListNode slowTrav = sum;
        while (trav1 != null || trav2 != null) {
            count++;
            if (count >= 1) {
                if (slowTrav.next != null) {
                    slowTrav = slowTrav.next;
                }
            }
            if (trav1 != null && trav2 != null) {

                travSum.val = trav1.val + trav2.val + carry;
            } else if (trav1 == null) {
                travSum.val = trav2.val + carry;
            } else if (trav2 == null) {
                travSum.val = trav1.val + carry;
            }
            if (travSum.val >= 10) {
                carry = travSum.val / 10;
                travSum.val = travSum.val % 10;
            } else
                carry = 0;
            if (trav1 != null)
                trav1 = trav1.next;
            if (trav2 != null)
                trav2 = trav2.next;
            // if(carry == 1){
            travSum.next = new ListNode(0);

            travSum = travSum.next;

        }
        if (carry == 1) {
            travSum.val = 1;
        }
        if (travSum.val == 0) {
            slowTrav.next = null;
        }
        return sum;
    }

    public static void main(String ...args){
        //add 2 list nodes for testing of above method...
    }

}
