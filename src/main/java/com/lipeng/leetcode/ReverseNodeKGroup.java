package com.lipeng.leetcode;

/**
 * Created by peng on 8/1/16.
 */
public class ReverseNodeKGroup {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (k < 2) {
            return head;
        }

        int count = countList(head);
        if (count < k) {
            return head;
        }

        ListNode[] nodes = new ListNode[k];

        int remain = count % k;
        int num = count / k;

        ListNode newHead = null;
        ListNode tmpHead = head;
        ListNode tailHead = null;
        for (int i = 0; i < num; i++) {
            int j = 0;
            while (j < k) {
                nodes[j] = tmpHead;
                tmpHead = tmpHead.next;
                nodes[j].next = null;
                j++;
            }

            if (newHead == null) {
                newHead = nodes[k - 1];
            }

            int m = 1;
            if (tailHead == null) {
                tailHead = nodes[k - 1];
            } else {
                tailHead.next = nodes[k - 1];
                tailHead = tailHead.next;
            }
            while (m < k) {
                tailHead.next = nodes[k - m - 1];
                tailHead = tailHead.next;
                m++;
            }
        }

        while (tmpHead != null) {
            tailHead.next = tmpHead;
            tailHead = tailHead.next;
            tmpHead = tmpHead.next;
        }

        return newHead;

    }

    private static int countList(ListNode head) {
        int count = 0;
        ListNode node = head;

        while (node != null) {
            count++;
            node = node.next;
        }

        return count;
    }


    public static void main(String[] argv) {

        int[] data = {1, 2, 3, 4, 5, 6};

        ListNode head = null;
        ListNode tmp = null;
        ListNode tail = null;
        for (int i = 0; i < data.length; i++) {
            tmp = new ListNode(data[i]);
            if (head == null) {
                head = tmp;
                tail = tmp;
            } else {
                tail.next = tmp;
                tail = tmp;
            }
        }


        ListNode result = reverseKGroup(head, 3);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }
}
